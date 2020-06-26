package arrays;

import java.util.Arrays;

public class DeleteDuplicatesArrayVariate1 {
    public static void main(String[] args) {
        int[] arr = new int[]{11,2,11,1,11,3,5,9,7,11,11,11,13};
        int delete = 11;
        int indx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != delete) {
                arr[indx] = arr[i];
                indx++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(indx);
    }
}
