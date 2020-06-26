package strings;

public class PalindromIgnoring {
    public static void main(String[] args) {
        String a = "Able was I, efe I saw Elba!...";
        a = a.toLowerCase();
        int left = 0;
        int right = a.length()-1;

        char[] s = a.toCharArray();
        while (left < right) {

            if (Character.isAlphabetic(s[left]) && Character.isAlphabetic(s[right])) {
                if (s[left] != s[right]) {
                    System.out.println("WTF");
                    return;
                }
                left++;
                right--;
            }

            if (!Character.isAlphabetic(s[left])) {
                left++;
            }
            if (!Character.isAlphabetic(s[right])) {
                right--;
            }
        }
        System.out.println("GJ");
    }
}
