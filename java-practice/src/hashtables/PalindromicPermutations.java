package hashtables;

import java.util.HashMap;
import java.util.Map;

public class PalindromicPermutations {
    public static void main(String[] args) {
        String test="edified";
        System.out.println(testPalindromic(test));
    }

    private static boolean testPalindromic(String test) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i<test.length(); i++) {
            if (map.containsKey(test.charAt(i))) {
                map.put(test.charAt(i), map.get(test.charAt(i)) +1);
            } else {
                map.put(test.charAt(i),1);
            }
        }
        boolean oddCount = false;
        for (Map.Entry<Character,Integer> entry : map.entrySet()) {
            if (entry.getValue() %2 == 1 && oddCount) return false;
            if (entry.getValue() %2 == 1) oddCount = true;

        }
        return true;
    }
}
