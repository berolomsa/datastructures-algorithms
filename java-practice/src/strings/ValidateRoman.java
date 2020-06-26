package strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidateRoman {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        String roman = "DCMXCXLIX";

        Map<Character, List<Character>> rules = new HashMap<>();
        rules.put('I', Arrays.asList('V', 'X'));
        rules.put('X', Arrays.asList('L', 'C'));
        rules.put('C', Arrays.asList('D', 'M'));

        boolean isValid = true;
        int indx = roman.length() - 1;
        while (indx > 0) {
            int numberPrev = map.get(roman.charAt(indx));
            int numberNext = map.get(roman.charAt(indx - 1));
            if (numberPrev <= numberNext) {
                if (numberNext == numberPrev && !isValid) {
                    System.out.println("Not Valid");
                    return;
                }
                isValid = true;
                indx--;
            } else {
                if (!isValid || !rules.containsKey(roman.charAt(indx - 1)) || !rules.get(roman.charAt(indx - 1)).contains(roman.charAt(indx))) {
                    System.out.println("Not Valid");
                    return;
                }
                indx--;
                isValid = false;

            }
        }
        System.out.println("VALID");

    }
}
