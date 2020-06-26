package strings;

public class TelexEncoding {
    public static void main(String[] args) {
        char[] a = ".b!ero?lomsad,ze                                                      ".toCharArray();
        int length = 16;
        String dot = "DOT";
        String comma = "COMMA";
        String excl = "EXCLAMATION MARK";
        String ques = "QUESTION MARK";

        int finalLength = length;
        for (int i = 0; i < length; i++) {
            switch (a[i]) {
                case '.':
                    finalLength = finalLength -1 + dot.length();
                    break;
                case '!':
                    finalLength = finalLength -1 + excl.length();
                    break;
                case ',':
                    finalLength = finalLength -1 + comma.length();
                    break;
                case '?':
                    finalLength = finalLength -1 + ques.length();
                    break;
            }
        }
        finalLength-=1;
        length -=1;
        while (length >= 0) {
            switch (a[length]) {
                case '.':
                    insertWord(a,finalLength,dot.toCharArray());
                    finalLength-=dot.length();
                    break;
                case '!':
                    insertWord(a,finalLength,excl.toCharArray());
                    finalLength-=excl.length();
                    break;
                case ',':
                    insertWord(a,finalLength,comma.toCharArray());
                    finalLength-=comma.length();
                    break;
                case '?':
                    insertWord(a,finalLength,ques.toCharArray());
                    finalLength-=ques.length();
                    break;
                default:
                    a[finalLength] = a[length];
                    finalLength--;
            }
            length--;
        }
        System.out.println(a);

    }

    private static void insertWord(char[] a, int finalLength, char[] dot) {
        for (int i =dot.length-1; i>=0; i--) {
            a[finalLength] = dot[i];
            finalLength--;
        }
    }
}
