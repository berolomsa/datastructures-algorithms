package arrays;

public class FindLongestEqualSubArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,1,5,6,6,6,6,7,7,7,7,7,7,7,1,1};
        int maxCount = 0;
        int count = 0;
        for (int i=1; i<arr.length; i++) {
            if (arr[i] == arr[i-1]) {
                count++;
            } else {
                maxCount = Math.max(maxCount,count);
                count = 0;
            }
        }
        System.out.println(maxCount+1);
    }
}
