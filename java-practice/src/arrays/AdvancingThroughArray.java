package arrays;

public class AdvancingThroughArray {
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,0,0,2,0,1};
        System.out.println(advance(arr,0));
    }

    private static boolean advance(int[] arr, int indx) {
        if (indx==arr.length-1) return true;

        for (int i=1; i<=arr[indx]; i++) {
            if (advance(arr, indx+i)) return true;
        }
        return false;
    }
}
