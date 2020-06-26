package strings;

public class StringManipulation {
    public static void main(String[] args) {
        char[] a = "abcbcdba     ".toCharArray();
        int size = 8;
        int indx = 0;
        int countA=0;
        for (int i=0; i<a.length;i++){
            if (a[i] != 'b') {
                a[indx] = a[i];
                indx++;
            }
            if(a[i]=='a') countA++;
        }
        System.out.println(a);
        int writeIndx = countA+indx-1;
        indx = indx-1;
        while(indx >=0) {
            if (a[indx] == 'a') {
                a[writeIndx] = 'd';
                writeIndx--;
                a[writeIndx] = 'd';
                writeIndx--;
            } else {
                a[writeIndx] = a[indx];
                writeIndx--;
            }
            indx--;
        }
        System.out.println(a);
    }
}
