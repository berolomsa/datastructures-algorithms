package arrays;

import java.util.Arrays;

public class DutchFlagProblem {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 10, 2, 56, 7, 2};

        reorder(array, 2);
        System.out.println(Arrays.toString(array));

        int[] array2 = new int[]{0, 1, 2, 0, 2, 1, 1};
        reorder(array2, 2);
        System.out.println(Arrays.toString(array2));
    }

    private static void reorder(int[] array, int pivot) {
        int pivotValue = array[pivot];
        int lessPivot = 0;
        int morePivot = array.length - 1;
        while (lessPivot < morePivot) {
            if (array[lessPivot] >= pivotValue && array[morePivot] < pivotValue) {
                int swap = array[lessPivot];
                array[lessPivot] = array[morePivot];
                array[morePivot] = swap;
            }
            if (array[lessPivot] < pivotValue) lessPivot++;
            if (array[morePivot] >= pivotValue) morePivot--;
        }

        lessPivot = 0;
        morePivot = array.length - 1;
        while (lessPivot < morePivot) {
            if (array[lessPivot] > pivotValue && array[morePivot] <= pivotValue) {
                int swap = array[lessPivot];
                array[lessPivot] = array[morePivot];
                array[morePivot] = swap;
            }
            if (array[lessPivot] <= pivotValue) lessPivot++;
            if (array[morePivot] > pivotValue) morePivot--;
        }
    }
}
