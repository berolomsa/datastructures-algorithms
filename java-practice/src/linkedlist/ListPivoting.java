package linkedlist;

import static linkedlist.ListNodeDouble.printNode;

public class ListPivoting {
    public static void main(String[] args) {
        ListNode<Integer> l1 = ListNode.stringToListNode(new int[]{0,1,2,3,4,11,6,7,9,3});
        int pivot = 7;
        ListNode<Integer> pivotLeftTail = new ListNode<>(0, null);
        ListNode<Integer> pivotLeftHead = new ListNode<>(0, pivotLeftTail);
        ListNode<Integer> pivotTail = new ListNode<>(0, null);
        ListNode<Integer> pivotHead = new ListNode<>(0, pivotTail);
        ListNode<Integer> pivotRightTail = new ListNode<>(0, null);
        ListNode<Integer> pivotRightHead = new ListNode<>(0, pivotRightTail);

        ListNode<Integer> curr = l1;
        while (curr != null) {
            if (curr.value < pivot) {
                pivotLeftTail.next = curr;
                pivotLeftTail = pivotLeftTail.next;
            } else if (curr.value == pivot) {
                pivotTail.next = curr;
                pivotTail = pivotTail.next;
            } else {
                pivotRightTail.next = curr;
                pivotRightTail = pivotRightTail.next;
            }
            curr = curr.next;
        }
        pivotLeftTail.next = pivotHead.next.next;
        pivotTail.next = pivotRightHead.next.next;
        pivotRightTail.next = null;

        printNode(pivotLeftHead.next.next);
        /*

         */
    }
}
