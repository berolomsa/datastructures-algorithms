package linkedlist;

import static linkedlist.ListNodeDouble.printNode;

public class EvenOddMerge {
    public static void main(String[] args) {
        ListNode<Integer> even = ListNode.stringToListNode(new int[]{0,1,2,3,4,5,6,7,8,9,10});
        ListNode<Integer> odd = even.next;
        ListNode<Integer> dummy = new ListNode<>(0, even);
        ListNode<Integer> oddHead = new ListNode<>(0, odd);
        while (true) {
            if (even.next.next == null) {
                odd.next = null;
                even.next = oddHead.next;
                break;
            }
            even.next = even.next.next;
            even = even.next;
            if (odd.next.next == null) {
                odd.next = null;
                even.next = oddHead.next;
                break;
            }
            odd.next = odd.next.next;
            odd = odd.next;

        }

        printNode(dummy.next);
    }
}
