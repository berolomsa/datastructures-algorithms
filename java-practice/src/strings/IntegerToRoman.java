package strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerToRoman {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

        int num = 238;
        String result = "";

        for (Map.Entry<Integer,String> a : map.entrySet()) {
            while(num/a.getKey() > 0) {
                result +=a.getValue();
                num -=a.getKey();
            }
        }
        System.out.println(result);
    }
}
