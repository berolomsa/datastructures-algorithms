package arrays;

import java.util.Arrays;

public class ArrayBootCamp {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 10, 2, 56, 7, 2};
        reorder(array);
        System.out.println(Arrays.toString(array));
    }

    private static void reorder(int[] array) {

        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            if (array[start] % 2 == 0) start++;
            if (array[end] % 2 != 0) end--;

            if (array[start] % 2 !=0 && array[end] %2 ==0) {
                int swap = array[start];
                array[start] = array[end];
                array[end] = swap;
            }
        }
    }
}
