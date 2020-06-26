package search;

public class CyclicallySortedArray {
    public static void main(String[] args) {
        int[] arr = new int[] {378, 478, 550, 631, 700, 103, 203, 220, 234, 279, 368};
        int left = 0;
        int right = arr.length -1;
        int mid = 0;
        while (left < right) {
            mid = left + (right - left)/2;
            int value = arr[mid];
            if (value > arr[right]) {
                left = mid+1;
            } else if (value <= arr[right]) {
                right = mid;
            }
        }
        System.out.println(arr[left]);
    }
}
