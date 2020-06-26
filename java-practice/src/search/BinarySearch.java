package search;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1,2,3,4,5,6,7,8,9,10,12,16);
        int find = 1;

        System.out.println(binarySearch(a, find));
    }

    private static int binarySearch(List<Integer> array, int find) {
        int leftIndx = 0;
        int rightIndx = array.size()-1;

        while (leftIndx <= rightIndx) {
            int currIndex = leftIndx + (rightIndx-leftIndx)/2;
            if (array.get(currIndex) > find) {
                rightIndx = currIndex-1;
            } else if (array.get(currIndex) < find) {
                leftIndx = currIndex+1;
            } else {
                return currIndex;
            }
        }
        return -1;
    }
}
