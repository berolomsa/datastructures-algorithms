package strings;

public class StringPalindrom {
    public static void main(String[] args) {
        String a = "beeb";
        String b = "bekxb";
        a = b;
        for (int i=0; i<a.length();i++) {
            if (a.charAt(i) != a.charAt(a.length()-1-i)) {
                System.out.println("FALSE");
                return;
            }
        }
        System.out.println("TRUE");
    }
}
