package strings;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "Alice likes Bob";

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length/2; i++) {
            char swap = chars[i];
            chars[i] = chars[chars.length-1-i];
            chars[chars.length-1-i] = swap;
        }

        int startIndx = 0;
        System.out.println(chars);
        for (int i=0; i<chars.length; i++) {
            if (chars[i] == ' ') {
                reversePls(startIndx, i-1,chars);
                startIndx = i+1;
            }
            if(i==chars.length-2 && Character.isAlphabetic(chars[chars.length-1]) && Character.isAlphabetic(chars[chars.length-2])) {
                reversePls(startIndx, i+1, chars);
            }
        }
        System.out.println(chars);
    }

    private static void reversePls(int startIndx, int reverse, char[] chars) {
        for(int i=startIndx; i<startIndx+(reverse-startIndx)/2; i++) {
            char swap = chars[i];
            chars[i] = chars[reverse-i+startIndx];
            chars[reverse-i+startIndx] = swap;
        }
    }
}
