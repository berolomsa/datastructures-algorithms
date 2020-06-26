package search;

public class FirstOccurenceK {
    public static void main(String[] args) {
        int[] arr = new int[] { 1,2,2,3,3, 3, 4, 5, 6, 7 };
        int k = 3;
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        int index = -1;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] > k) {
                right = mid-1;
            } else if (arr[mid] < k) {
                left = mid +1;
            } else {
                index = mid;
                right = mid-1;
            }
        }
        System.out.println(index);
    }
}
