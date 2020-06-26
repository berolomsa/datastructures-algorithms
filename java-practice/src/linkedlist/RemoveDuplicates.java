package linkedlist;

import java.util.Objects;

import static linkedlist.ListNodeDouble.printNode;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ListNode<Integer> l1 = ListNode.stringToListNode(new int[]{1,1,2,2,3,3,4,4,4,4,5,6,7,7,7,7,9});
        ListNode<Integer> dummy = new ListNode<>(0, l1);

        ListNode<Integer> prev = dummy;
        ListNode<Integer> curr = dummy.next;

        while (curr != null) {
            if (!Objects.equals(prev.value, curr.value)) {
                prev.next = curr;
                prev = prev.next;
            }
            curr = curr.next;
        }
        printNode(dummy.next);
    }
}
