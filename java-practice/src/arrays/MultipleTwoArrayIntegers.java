package arrays;

import java.util.Arrays;

public class MultipleTwoArrayIntegers {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        int[] arr2 = new int[]{9, 8, 7};
        int[] result = new int[arr.length + arr2.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = arr2.length - 1; j >= 0; j--) {
                result[i + j + 1] = (result[i+j+1] + arr[i] * arr2[j]);
                result[i+j] = result[i+j] + result[i+j+1]/10;
                result[i+j+1]%=10;
            }
        }
        System.out.println(Arrays.toString(result));
    }

}
