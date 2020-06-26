package linkedlist;

public class MergeTwoSortedDoubleLists {

    public static void main(String[] args) {
        ListNodeDouble<Integer> l1 = ListNodeDouble.stringToListNodeDouble(new int[]{1,2,3,4,56,67});
        ListNodeDouble<Integer> l2 = ListNodeDouble.stringToListNodeDouble(new int[]{10,12,14,15,80,100});

        ListNodeDouble<Integer> dummy = new ListNodeDouble<>(0, null,null);
        ListNodeDouble<Integer> curr = dummy;

        while(true) {
            if (l1 == null || l2 == null) break;

            if (l1.value > l2.value) {
                curr.next = l2;
                l2 = l2.next;
            } else {
                curr.next = l1;
                l1 = l1.next;
            }
            curr.next.prev = curr;
            curr = curr.next;
        }

        if (l1 == null) {
            curr.next = l2;
            curr.next.prev = curr;
        } else if (l2 == null) {
            curr.next = l1;
            curr.next.prev = curr;
        }
        dummy = dummy.next;

        while (true) {
            if (dummy.next == null) {
                System.out.println(dummy.value);
                break;
            }
            System.out.println(dummy.value);
            dummy = dummy.next;
        }

        while (dummy != null) {
            System.out.println(dummy.value);
            dummy = dummy.prev;
        }
    }
    
}
