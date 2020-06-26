package linkedlist;

public class ListNode<T> {
    public T value;
    public ListNode<T> next;

    public ListNode(T value, ListNode<T> next) {
        this.next = next;
        this.value = value;
    }

    public static ListNode<Integer> stringToListNode(int[] nodeValues) {
        // Generate array from the input

        // Now convert that list into linked list
        ListNode<Integer> dummyRoot = new ListNode<>(0, null);
        ListNode<Integer> ptr = dummyRoot;
        for(int item : nodeValues) {
            ptr.next = new ListNode<>(item, null);
            ptr = ptr.next;
        }
        return dummyRoot.next;
    }
}
