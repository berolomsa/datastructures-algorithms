package stackandqueues;

import java.util.Deque;
import java.util.LinkedList;

public class QueueMax {
    // 5 2 7
    private Deque<Integer> queueNodes = new LinkedList<>();
    private Deque<Integer> stackForMax = new LinkedList<>();

    public Integer deque() {
        if (queueNodes.isEmpty()) throw new IllegalArgumentException();
        Integer removeInt = queueNodes.removeFirst();
        if (removeInt == stackForMax.peekFirst()) {
            stackForMax.removeFirst();
        }
        return removeInt;
    }

    public void enqueue(Integer value) {
        queueNodes.addLast(value);
        while (!stackForMax.isEmpty()) {
            if (stackForMax.peekFirst() <= value) stackForMax.removeFirst();
            else break;
        }
        stackForMax.addFirst(value);
    }

    public Integer max() {
        return stackForMax.peekFirst();
    }
}
