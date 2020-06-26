package linkedlist;

public class OverlappingLists {
    public static void main(String[] args) {
        ListNode<Integer> l1 = new ListNode<>(1,null);
        ListNode<Integer> l2 = new ListNode<>(2,null);
        ListNode<Integer> l3 = new ListNode<>(3,null);
        ListNode<Integer> l4 = new ListNode<>(4,null);
        ListNode<Integer> l5 = new ListNode<>(5,null);
        ListNode<Integer> l6 = new ListNode<>(6,null);
        ListNode<Integer> l7 = new ListNode<>(7,null);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        l7.next = null;

        ListNode<Integer> a1 = new ListNode<>(10,null);
        ListNode<Integer> a2 = new ListNode<>(11,null);
        a1.next = a2;
        a2.next = l5;

        ListNode<Integer> copyL = l1;
        ListNode<Integer> copyA = a1;
        int length1 = 1;
        int length2 = 1;

        while (copyL != null) {
            length1++;
            copyL = copyL.next;
        }

        while (copyA != null) {
            length2++;
            copyA = copyA.next;
        }
        int a = length1 - length2;
        int indx = 0;
        copyL = l1;
        copyA = a1;
        while (a != indx) {
            indx++;
            copyL = copyL.next;
        }

        while (copyA != null && copyL != null) {
            if (copyA == copyL) {
                System.out.println("FOUND" + copyA.value);
                break;
            }
            copyA = copyA.next;
            copyL = copyL.next;
        }
    }
}
