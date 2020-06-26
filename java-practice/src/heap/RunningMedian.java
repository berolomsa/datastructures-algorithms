package heap;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class RunningMedian {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,0,3,5,2,0,1);
        runningMedian(list.iterator());
    }

    private static void runningMedian(Iterator<Integer> iterator) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        while (iterator.hasNext()) {
            int x = iterator.next();
            if (minHeap.size() == 0) minHeap.add(x);
            else if (minHeap.peek() <= x) minHeap.add(x);
            else maxHeap.add(x);

            if (maxHeap.size() > minHeap.size()) {
                minHeap.add(maxHeap.remove());
            } else if (minHeap.size() > maxHeap.size()+1) {
                maxHeap.add(minHeap.remove());
            }

            System.out.println(maxHeap.size() == minHeap.size() ? 0.5 * (maxHeap.peek() + minHeap.peek()) : minHeap.peek().toString());
        }
    }
}
