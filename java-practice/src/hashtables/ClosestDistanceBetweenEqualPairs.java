package hashtables;

import java.util.HashMap;
import java.util.Map;

public class ClosestDistanceBetweenEqualPairs {
    public static void main(String[] args) {
        String[] s = new String[] { "All", "work", "and", "no", "play", "makes", "for", "no", "work", "no", "fun", "and", "no", "results" };

        int minIndx = Integer.MAX_VALUE;
        int firstIndx = -1;
        int secondIndx = -1;
        Map<String, Integer> stringToIndexMap = new HashMap<>();

        for (int i = 0; i < s.length; i++) {
            if (!stringToIndexMap.containsKey(s[i])) {
                stringToIndexMap.put(s[i], i);
            } else {
                int index = stringToIndexMap.get(s[i]);
                if (i - index < minIndx) {
                    firstIndx = index;
                    secondIndx = i;
                    minIndx = i - index;
                }
                stringToIndexMap.put(s[i], i);
            }
        }
        System.out.println(firstIndx + " " + secondIndx);
    }
}
