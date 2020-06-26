package search;

public class FindSQRT {
    public static void main(String[] args) {
        int num = 16;
        System.out.println(findSQRT(num));
    }

    private static int findSQRT(int num) {
        if (num == 1) return 1;

        int left =0;
        int right = num;
        while (left <= right) {
            int mid = left + (right-left)/2;
            int value = mid*mid;
            if (value <=num) {
                left = mid+1;
            } else  {
                right = mid-1;
            }
        }
        return left-1;
    }
}
