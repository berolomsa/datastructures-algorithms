package stackandqueues;

public class QueueImplementArray {
    private Integer[] array;
    private int head = 0;
    private int tail = 0;

    public QueueImplementArray(int size) {
        array = new Integer[size];
    }

    public int size() {
        return tail-head;
    }

    public void enqueue(Integer value) {
        if (tail >= array.length) {
            Integer[] array2 = new Integer[array.length*2];
            System.arraycopy(array, head, array2, 0, size());
            array = array2;
            tail -=head;
            head = 0;
        }
        array[tail++] = value;
    }

    public int dequeue() {
        if (size() == 0) throw new IllegalArgumentException();
        return array[head++];
    }
}
