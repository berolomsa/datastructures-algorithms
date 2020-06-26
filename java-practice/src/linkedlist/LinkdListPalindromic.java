package linkedlist;

import static linkedlist.ListNodeDouble.printNode;

public class LinkdListPalindromic {
    public static void main(String[] args) {
        ListNode<Integer> l1 = ListNode.stringToListNode(new int[]{0,1,2,3,4,3,2,1,0});

        ListNode<Integer> slow = l1;
        ListNode<Integer> fast = l1;
        while (fast != null && fast.next != null) {
            slow  = slow.next;
            fast = fast.next.next;
        }

        ListNode<Integer> prev = null;
        ListNode<Integer> head = null;
        while (slow != null) {
            if (slow.next == null) {
                head = slow;
            }
            ListNode<Integer> temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        printNode(head);


        while(head != null && l1 != null) {
            if(head.value != l1.value) {
                System.out.println("\nNot palindrom");
                break;
            }
            head = head.next;
            l1 = l1.next;
        }

        System.out.println("\npalindrom");
    }
}
