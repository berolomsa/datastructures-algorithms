package arrays;

import java.util.Arrays;

public class DeleteDuplicatesArray {
    public static void main(String[] args) {
        int[] arr = new int[]{0,2,3,5,5,7,11,11,11,13};
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[count-1] != arr[i]) {
                arr[count] = arr[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }
}
