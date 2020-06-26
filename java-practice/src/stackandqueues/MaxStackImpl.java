package stackandqueues;

import java.util.Deque;
import java.util.LinkedList;

public class MaxStackImpl {
    public static void main(String[] args) {
        MaxStack maxStack = new MaxStack();
        maxStack.push(1);
        maxStack.push(3);
        maxStack.push(5);
        maxStack.push(4);
        maxStack.push(9);

        System.out.println(maxStack.max());
        maxStack.pop();
        System.out.println(maxStack.max());
        maxStack.pop();
        System.out.println(maxStack.max());
        maxStack.pop();
        System.out.println(maxStack.max());
        maxStack.pop();
        System.out.println(maxStack.max());
        maxStack.pop();
    }

    public static class MaxStack {
        private Deque<MaxStackNode> maxStackDeque = new LinkedList<>();


        public Integer max() {
            if (maxStackDeque.isEmpty()) throw new IllegalArgumentException("Empty");
            return maxStackDeque.peek().max;
        }

        public Integer pop() {
            if (maxStackDeque.isEmpty()) throw new IllegalArgumentException("Empty");
            return maxStackDeque.removeFirst().value;
        }

        public void push(Integer value) {
            if (maxStackDeque.isEmpty()) {
                maxStackDeque.addFirst(new MaxStackNode(value, value));
            } else {
                maxStackDeque.addFirst(new MaxStackNode(value, Math.max(value, max())));
            }
        }
    }

    public static class MaxStackNode {
        private Integer value;
        private Integer max;

        public MaxStackNode(Integer value, Integer max) {
            this.value = value;
            this.max = max;
        }
    }
}
