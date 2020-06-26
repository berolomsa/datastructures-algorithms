package linkedlist;

public class ListNodeDouble<T> {
    public T value;
    public ListNodeDouble<T> next;
    public ListNodeDouble<T> prev;

    public ListNodeDouble(T value, ListNodeDouble<T> next, ListNodeDouble<T> prev) {
        this.next = next;
        this.value = value;
        this.prev = prev;
    }

    public static ListNodeDouble stringToListNodeDouble(int[] nodeValues) {
        // Generate array from the input

        // Now convert that list into linked list
        ListNodeDouble dummyRoot = new ListNodeDouble(0, null, null);
        ListNodeDouble ptr = dummyRoot;
        for(int item : nodeValues) {
            ptr.next = new ListNodeDouble(item, null, ptr);
            ptr = ptr.next;
        }
        dummyRoot.next.prev = null;
        return dummyRoot.next;
    }

    public static void printNode(ListNode<Integer> dummy) {
        while (true) {
            if (dummy == null) break;
            System.out.print(dummy.value +" -> ");
            dummy = dummy.next;
        }
    }
}
