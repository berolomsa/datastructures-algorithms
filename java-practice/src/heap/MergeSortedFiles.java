package heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class MergeSortedFiles {
    public static void main(String[] args) {
        List<Integer> arr1 = Arrays.asList(new Integer[] {3,5,7});
        List<Integer> arr2 = Arrays.asList(new Integer[] {0,6});
        List<Integer> arr3 = Arrays.asList(new Integer[] {0,6,28});

        List<Iterator<Integer>> a = new ArrayList<>();
        a.add(arr1.iterator());
        a.add(arr2.iterator());
        a.add(arr3.iterator());
        mergeSortedArrays(a);
    }

    public static void mergeSortedArrays(List<Iterator<Integer>> iterators) {
        PriorityQueue<Entry> priorityQueue = new PriorityQueue<>(new Comparator<Entry>() {
            @Override public int compare(Entry o1, Entry o2) {
                return o1.value.compareTo(o2.value);
            }
        });

        for (int i = 0; i < iterators.size(); i++) {
            Iterator<Integer> b = iterators.get(i);
            if (b.hasNext()) {
                priorityQueue.add(new Entry(i, b.next()));
            }
        }
        List<Integer> result = new ArrayList<>();
        while (!priorityQueue.isEmpty()) {
            Entry entry = priorityQueue.poll();
            result.add(entry.value);
            if (iterators.get(entry.indexArray).hasNext()) {
                priorityQueue.add(new Entry(entry.indexArray, iterators.get(entry.indexArray).next()));
            }
        }
        System.out.println(result.toString());
        System.out.println(result.size());
    }

    public static class Entry {
        int indexArray;
        Integer value;

        public Entry(int indexArray, int value) {
            this.indexArray = indexArray;
            this.value = value;
        }
    }
}
