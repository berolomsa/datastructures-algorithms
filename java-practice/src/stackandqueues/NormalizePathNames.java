package stackandqueues;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class NormalizePathNames {
    public static void main(String[] args) {
        String normalize = "scripts//./../scripts/awkscripts/././";
        normalize = "/sc//./../tc/awk/././.";
        Deque<String> a = new LinkedList<>();
        String[] split = normalize.split("/");
        if (normalize.substring(0,1).equals("/")) {
            a.add("/");
        }
        for (String member : split) {
            if (member.isEmpty() || member.equals(".")) continue;
            if (member.equals("..")) {
                if (a.isEmpty() || a.peek().equals("..")) {
                    a.addFirst(member);
                } else if (a.peekFirst().equals("/")) {
                    throw new IllegalArgumentException();
                } else {
                    a.removeFirst();
                }
            } else {
                a.addFirst(member);
            }
        }

        if (!a.isEmpty()) {
            if (a.peekLast().equals("/")) {
                System.out.print(a.removeLast());
            }
            Iterator<String> it = a.descendingIterator();
            while (it.hasNext()) {
                System.out.print(it.next());
                if (it.hasNext()) {
                    System.out.print("/");
                }
            }
        }
    }
}
