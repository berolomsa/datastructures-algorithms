package strings;

public class IntegerToString {
    public static void main(String[] args) {
        int a = 12345678;
        String b = "";

        while(a > 10) {
            b += (char) ('0' + a%10);
            a/=10;
        }
        b+=(char) ('0' + a);
        String result = "";
        for (int i = b.length()-1; i >=0; i--) {
            result+=b.charAt(i);
        }
        System.out.println(result);


        int result2 = 0;
        int multiplier = 1;
        for (int i = result.length()-1; i >=0; i--) {
            result2 +=  (result.charAt(i) - '0')*multiplier;
            multiplier*=10;
        }
        System.out.println(result2);
    }
}
