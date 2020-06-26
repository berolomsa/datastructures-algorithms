package linkedlist;

import static linkedlist.ListNodeDouble.printNode;

public class AutoListBasedIntegers {
    public static void main(String[] args) {
        ListNode<Integer> l1 = ListNode.stringToListNode(new int[]{9,9,9,9,9});
        ListNode<Integer> l2 = ListNode.stringToListNode(new int[]{9,9,9,9});

        int mod = 0;
        ListNode<Integer> dummy = new ListNode<>(0,null);
        ListNode<Integer> sum = dummy;
        while (true) {
            int val = 0;
            if (l1 == null && l2 == null) break;
            else if (l1 == null) {
                val = l2.value+mod;
            } else if (l2 == null) {
                val = l1.value+mod;
            } else {
                val = l1.value + l2.value+mod;
            }
            sum.next = new ListNode<>(val%10, null);
            sum = sum.next;
            mod = val/10;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        if (mod !=0) {
            sum.next = new ListNode<>(mod, null);
        }
        printNode(dummy.next);
    }
}
