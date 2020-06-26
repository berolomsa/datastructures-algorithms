package strings;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        String roman = "XXXXXIIIIIIIII";

        int indx = roman.length()-1;
        int result = 0;
        while (indx >-1) {
            if (indx > 0) {
                int numberPrev = map.get(roman.charAt(indx));
                int numberNext = map.get(roman.charAt(indx-1));
                if (numberPrev <= numberNext) {
                    result += numberPrev;
                    indx--;
                } else {
                    result += numberPrev-numberNext;
                    indx-=2;
                }
            } else {
                result+=map.get(roman.charAt(indx));
                indx--;
            }
        }
        System.out.println(result);
    }
}
