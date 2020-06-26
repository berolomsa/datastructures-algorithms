package stackandqueues;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.Stack;

public class QueueImplementStack {
    private Stack<Integer> integerStack = new Stack<>();
    private Stack<Integer> integerStack2 = new Stack<>();


    public void enqueue(Integer value) {
        integerStack.push(value);
    }

    public Integer dequeue() {
        if (integerStack.isEmpty() && integerStack2.isEmpty()) {
            throw new IllegalArgumentException();
        }
        if (integerStack2.isEmpty()) {
            while (!integerStack.isEmpty()) {
                integerStack2.push(integerStack.pop());
            }
        }

        return integerStack2.pop();
    }
}
