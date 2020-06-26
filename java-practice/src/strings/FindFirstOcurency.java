package strings;

public class FindFirstOcurency {
    public static void main(String[] args) {
        String text = "I am going to school am";
        String search = "am";
        int searchHash = 0;
        int windowHash = 0;
        int powerS = 1;

        for (int i = 0; i < search.length(); i++) {
            powerS = i>0?powerS*26:1;
            searchHash = searchHash * 26 +search.charAt(i);
            windowHash = windowHash * 26 +text.charAt(i);
        }

        for (int i= search.length(); i<text.length(); i++) {

            if (searchHash == windowHash && search.equals(text.substring(i- search.length(), i))) {
                System.out.println(i- search.length());
            }

            windowHash = windowHash- text.charAt(i- search.length()) * 26;
            windowHash = windowHash  * 26 + text.charAt(i);
        }

        if (searchHash == windowHash && search.equals(text.substring(text.length()- search.length()))) {
            System.out.println(text.length()- search.length());
        }
    }
}
