package search;

public class BinarySearchEqualIndex {
    public static void main(String[] args) {
        int[] arr = new int[] { -2, 0, 1, 2, 4, 5, 9 };
        int left =0;
        int right = arr.length-1;

        while (left <= right) {
            int mid = left + (right - left)/2;
            int value = arr[mid];
            if (value > mid) {
                right = mid-1;
            } else if (value < mid) {
                left = mid+1;
            } else {
                System.out.println(value);
                return;
            }
        }
    }
}
