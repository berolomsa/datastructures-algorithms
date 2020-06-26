package search;

public class StrictlyAscDescSequence {
    public static void main(String[] args) {
        int[] arr = new int[] { 8, 10, 20, 80, 100, 200, 400, 500, 300};
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        while (left <= right) { //
            mid = left + (right - left) / 2; //4
            int value = arr[mid]; //100
            if (value > arr[left] && value <= arr[right]) { //
                left = mid + 1;
            } else if (value <= arr[left] && value > arr[right]) {
                right = mid - 1;
            }
        }
        System.out.println(arr[left]);
    }
}
