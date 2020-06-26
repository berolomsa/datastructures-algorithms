package linkedlist;

import static linkedlist.ListNodeDouble.printNode;

public class ReverseSingleSubList {
    public static void main(String[] args) {
        ListNode<Integer> l1 = ListNode.stringToListNode(new int[]{1, 2, 3, 4, 5, 6, 56, 67});
        int s = 2;
        int f = 4;
        ListNode<Integer> dummyHead = new ListNode<>(0, l1);
        ListNode<Integer> sublistHead = dummyHead;
        int k = 1;
        while (k++ < s) {
            sublistHead = sublistHead.next;
        }
        // Reverse sublist.
        ListNode<Integer> sublistlter = sublistHead.next;
        while (s++ < f) {
            ListNode<Integer> temp = sublistlter.next; //TEMP = 3
            sublistlter.next = temp.next; //2.NEXT = 4
            temp.next = sublistHead.next; // 3->NEXT=4
            sublistHead.next = temp; //
        }
        // 1 -> 2 -> 3 -> 4 -> 5 -> 6
        // 1 -> 4 -> 3 -> 2 -> 5 -> 6
        printNode(dummyHead.next);
    }

}
