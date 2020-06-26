package linkedlist;

public class ListCycle {
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
        l5.next = l2;
        l6.next = l7;
        l7.next = l4;
//        hasCycle(l1);
        ListNode<Integer> slow = l1;
        ListNode<Integer> fast = l1;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                System.out.println("Found Cycle");
                return;
            }
        }
    }
    public static ListNode<Integer> hasCycle (ListNode<Integer> head) { ListNode <Integer> fast = head, slow = head;
        while (fast != null && fast.next != null&&fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {

                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                System.out.println(slow.value);
                return slow;
            }
        }
        return null;
    }
}
