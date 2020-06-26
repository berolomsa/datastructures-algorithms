package linkedlist;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode<Integer> l1 = ListNode.stringToListNode(new int[]{1,2,3,4,56,67});
        ListNode<Integer> l2 = ListNode.stringToListNode(new int[]{0,10,12,14,15,80,100});

        ListNode<Integer> dummy = new ListNode<>(0, null);
        ListNode<Integer> current = dummy;

        while(true) {
            if (l1 == null || l2 == null) break;
            if (l1.value > l2.value) {
                current.next = l2;
                l2 = l2.next;
            } else {
                current.next = l1;
                l1 = l1.next;
            }
            current = current.next;
        }

        if (l1 == null) {
            current.next = l2;
        } else if (l2 == null) {
            current.next = l1;
        }
        dummy = dummy.next;
        while (true) {
            if (dummy == null) break;
            System.out.println(dummy.value);
            dummy = dummy.next;
        }
    }
}
