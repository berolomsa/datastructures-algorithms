package linkedlist;

import static linkedlist.ListNodeDouble.printNode;

public class RemoveKthElement {
    public static void main(String[] args) {
        ListNode<Integer> l1 = ListNode.stringToListNode(new int[]{1,2,3,4,56,67,80,1,2,3});
        int k = 3;
        ListNode<Integer> a = l1;
        ListNode<Integer> t = l1;
        int indx = 0;
        while (a.next != null) {
            if (indx != k) {
                indx++;
                a = a.next;
            } else {
                a = a.next;
                t = t.next;
            }
        }
        t.next = t.next.next;
        printNode(l1);
        /*
            a
            t
         */
    }
}
