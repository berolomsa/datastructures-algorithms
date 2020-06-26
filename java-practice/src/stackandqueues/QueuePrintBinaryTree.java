package stackandqueues;

import com.sun.source.tree.BinaryTree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import static stackandqueues.BinaryTreeImpl.insertLevelOrder;

public class QueuePrintBinaryTree {
    public static void main(String[] args) {
        BinaryTreeImpl.Node a = null;
        a =  insertLevelOrder(new int[]{314,6,6,271,561,2,271,28,0,3,1,28}, a, 0);

        Deque<BinaryTreeImpl.Node> deque = new LinkedList<>();
        deque.addLast(a);

        while (!deque.isEmpty()) {
            List<BinaryTreeImpl.Node> nodes = new ArrayList<>();
            while(!deque.isEmpty()) {
                BinaryTreeImpl.Node node = deque.removeFirst();
                System.out.print(node.data+",");
                if (node.left !=null)
                    nodes.add(node.left);
                if (node.right != null)
                    nodes.add(node.right);
            }
            deque.addAll(nodes);
            System.out.println();
        }
    }

}
