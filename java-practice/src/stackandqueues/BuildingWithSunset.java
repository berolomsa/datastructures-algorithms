package stackandqueues;

import java.util.Deque;
import java.util.LinkedList;

public class BuildingWithSunset {
    public static void main(String[] args) {
        int[] array = new int[]{4,6,8,7,10,9};
        Deque<Integer> deque = new LinkedList<>();
        for (int a : array) {
            while (!deque.isEmpty() && a >= deque.peekLast()) {
                deque.removeLast();
            }
            deque.addLast(a);
        }

        deque.stream().forEach(a -> System.out.print(a + ","));


        reverseOrder(array);
    }

    private static void reverseOrder(int[] array) {
        System.out.println();
        Deque<Integer> deque = new LinkedList<>();
        for (int a : array) {
            if (!deque.isEmpty() && deque.peekFirst() >= a) {

            }else{
                deque.addFirst(a);
            }
        }

        deque.stream().forEach(a -> System.out.print(a + ","));
    }
}
