package heap;

import java.util.PriorityQueue;

public class KSortedArray {
    public static void main(String[] args) {
        int[] arr = new int[]{3,-1,2,6,4,5,8};
        int k=2;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i=0; i<=k; i++) {
            priorityQueue.add(arr[i]);
        }

        for (int i=k+1; i<arr.length; i++) {
            System.out.println(priorityQueue.poll());
            priorityQueue.add(arr[i]);
        }

        while (!priorityQueue.isEmpty())
            System.out.println(priorityQueue.poll());
    }
}
