package hashtables;

import java.util.HashMap;
import java.util.Map;

public class AnnonymousLetter {
    public static void main(String[] args) {
        String letter = "blaaa";
        String magazine = "bbllaa";

        Map<Character, Integer> countCh = new HashMap<>();

        for (int i=0; i<magazine.length(); i++) {
            if (countCh.containsKey(magazine.charAt(i))) {
                countCh.put(magazine.charAt(i), countCh.get(magazine.charAt(i))+1);
            } else {
                countCh.put(magazine.charAt(i), 1);
            }
        }

        for (int i=0; i<letter.length(); i++) {
            if (countCh.containsKey(letter.charAt(i))) {
                if (countCh.get(letter.charAt(i))==1) {
                    countCh.remove(letter.charAt(i));
                } else {
                    countCh.put(letter.charAt(i), countCh.get(letter.charAt(i))-1);
                }
            } else {
                System.out.println("not possible");
                return;
            }
        }
        System.out.println("possible");
    }
}
