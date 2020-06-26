package strings;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] A = new int[]{1,4,6,8,9,0,0,0,0,0,0,0,0,0};
        int[] B = new int[]{1,3,4,5,5,7,8};
        int lengthA = 5;
        int lengthB = B.length;
        int totalLength = lengthA + B.length;

        lengthA--;
        lengthB--;
        totalLength--;
        while (totalLength >= 0) {
            if (A[lengthA] >= B[lengthB]) {
                A[totalLength] = A[lengthA];
                if (lengthA !=0)
                    lengthA--;
            } else {
                A[totalLength] = B[lengthB];
                if (lengthB !=0)
                    lengthB--;
            }

            totalLength--;
        }

        System.out.println(Arrays.toString(A));
    }
}
