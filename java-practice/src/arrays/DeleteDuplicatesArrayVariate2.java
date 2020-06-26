package arrays;

import java.util.Arrays;

public class DeleteDuplicatesArrayVariate2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,2,2,2,4,4,4,5,6,7,8,8,8};
        int delete = 3;
        delete = Math.min(delete,2);
        int indx = 1;
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1]) count++;
            if (count <= delete) {
                arr[indx] = arr[i];
                indx++;
            } else {
                if (arr[i] != arr[i-1]) {
                    arr[indx] = arr[i];
                    indx++;
                    count=1;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(indx);
    }
}
