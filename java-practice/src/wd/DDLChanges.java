package wd;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DDLChanges {

    private static Map<String, Integer> map = new HashMap<>();
    public static void main(String[] args) throws IOException {
        String folderName = "/Users/bero.lomsadze/work/dev/apps/engine-dev-cp/ee-db-scripts/src/main/resources/database/release";
        String keyword = "--alter \"";
        List<Path> list = Files.walk(Paths.get(folderName))
                .filter(Files::isRegularFile)
                .filter(a -> a.getFileName().toString().contains("DB.ini"))
                .collect(Collectors.toList());

        System.out.println(list.toString());
        for(Path path : list) {
            Files.lines(path).forEach(a -> {
                int indx = a.indexOf(keyword);
                if (indx != -1) {
                    String subs = a.substring(indx+keyword.length());
                    subs = subs.toLowerCase();
                    String[] split = subs.split(" ");
                    String key = split[0] + " " + split[1];
                    if (map.containsKey(key)) {
                        map.put(key, map.get(key)+1);
                    } else {
                        map.put(key, 1);
                    }
                }
            });
        }
        double totalModify = 0;
        double totalDrop = 0;
        double totalAddColumn = 0;
        double totalAddIndex = 0;
        double sumTotal = 0;
        for (Map.Entry<String, Integer> a : map.entrySet()) {
            if (a.getKey().startsWith("modify") || a.getKey().startsWith("change")) totalModify+=a.getValue();
            else if (a.getKey().startsWith("drop index") || a.getKey().startsWith("dorp")) totalDrop +=a.getValue();
            else if (a.getKey().startsWith("add index")) totalAddIndex+=a.getValue();
            else if (a.getKey().startsWith("drop") || a.getKey().startsWith("add")  || a.getKey().startsWith("alter") && !a.getKey().startsWith("add index")) totalAddColumn +=a.getValue();
            sumTotal+=a.getValue();
        }
        System.out.println("Total modify column: " + Math.round(totalModify/sumTotal * 100));
        System.out.println("Total drop index: " + Math.round(totalDrop/sumTotal * 100));
        System.out.println("Total add column: " + Math.round(totalAddColumn/sumTotal * 100));
        System.out.println("Total add index: " + Math.round(totalAddIndex/sumTotal * 100));
        System.out.println("Total sumTotal: " + sumTotal);

    }
}
