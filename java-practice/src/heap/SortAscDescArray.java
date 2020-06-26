package heap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SortAscDescArray {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{57,131,493,294,221,339,418,452,442,190,10,5,8,200,1};
        boolean isIncr = true;
        List<Iterator<Integer>> a = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] <= arr[i] && isIncr) {
                list.add(arr[i]);
            } else if (arr[i-1] > arr[i] && isIncr) {
                isIncr = false;
                a.add(list.iterator());
                list = new ArrayList<>();
                list.add(arr[i]);
            } else if (arr[i-1] >= arr[i] && !isIncr) {
                list.add(arr[i]);
            } else if(arr[i-1] < arr[i]  && !isIncr) {
                isIncr = true;
                a.add(list.iterator());
                list = new ArrayList<>();
                list.add(arr[i]);
            }
        }
        System.out.println(arr.length);
        if (list.size() > 0) a.add(list.iterator());
        MergeSortedFiles.mergeSortedArrays(a);
    }
}
