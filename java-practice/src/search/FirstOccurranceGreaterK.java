package search;

public class FirstOccurranceGreaterK {
    public static void main(String[] args) {
        int[] arr = new int[] { -14,-10,2,108,108,243,285,285,285,401};
        int k = 401;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int value = arr[mid];
            if (value <= k) {
                left = mid+1;
            } else if (value > k) {
                right = mid-1;
            }
        }

        if (left <= arr.length-1)
            System.out.println(left);

    }
}
