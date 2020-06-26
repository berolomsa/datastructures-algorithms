package linkedlist;

import static linkedlist.ListNodeDouble.printNode;

public class ReverseList {
    public static void main(String[] args) {
        ListNode<Integer> l1 = ListNode.stringToListNode(new int[]{1, 2, 3, 4, 5, 6, 56, 67});


        ListNode<Integer> prev = null;
        ListNode<Integer> curr = l1;
        ListNode<Integer> next = null;

        while (curr != null) {
            next = curr.next; //
            curr.next = prev; //null
            prev = curr; //1
            curr = next; //2
        }
        printNode(prev);
    }
/*
    prev null 1
    curr 1 2
    next null 2
 */
    private static ListNode<Integer> reverseList(ListNode<Integer> l1) {
        if (l1.next == null) {
            return l1;
        }

        ListNode<Integer> a = reverseList(l1.next);
        l1.next.next = l1;
        l1.next = null;
        return a;
    }
}
