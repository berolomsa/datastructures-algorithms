package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MnemonicsPhoneNumber {
    public static void main(String[] args) {
        String number = "2276696";
        Map<Integer, List<Character>> list = new HashMap<>();
        list.put(2, Arrays.asList('A','B','C'));
        list.put(3, Arrays.asList('D','E','F'));
        list.put(4, Arrays.asList('G','H','I'));
        list.put(5, Arrays.asList('J','K','L'));
        list.put(6, Arrays.asList('M','N','O'));
        list.put(7, Arrays.asList('P','Q','R', 'S'));
        list.put(8, Arrays.asList('T','U','V'));
        list.put(9, Arrays.asList('W','X','Y', 'Z'));
        List<String> acronyms = new ArrayList<>();

        computeMnemnonics(acronyms, "", number, list);
        System.out.println(acronyms.toString());


    }

    private static void computeMnemnonics(List<String> acronyms, String result, String number, Map<Integer, List<Character>> list) {
        if (number.length() == 0) {
            acronyms.add(result);
            return;
        }

        int digit = Character.getNumericValue(number.charAt(0));
        List<Character> characters = list.get(digit);
        for (Character character : characters) {
            result +=character;
            computeMnemnonics(acronyms, result, number.substring(1), list);
            result = result.substring(0, result.length()-1);
        }
    }
}
