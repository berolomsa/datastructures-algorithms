package stackandqueues;

public class BinaryTreeImpl {
        private static Node root;

        // Tree Node 
        static class Node {
            int data;
            Node left, right;
            Node(int data)
            {
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }

        // Function to insert nodes in level order 
        public static Node insertLevelOrder(int[] arr, Node root, int i)
        {
            // Base case for recursion 
            if (i < arr.length) {
                Node temp = new Node(arr[i]);
                root = temp;

                // insert left child 
                root.left = insertLevelOrder(arr, root.left,
                        2 * i + 1);

                // insert right child 
                root.right = insertLevelOrder(arr, root.right,
                        2 * i + 2);
            }
            return root;
        }

        // Function to print tree nodes in InOrder fashion 
        public static void inOrder(Node root)
        {
            if (root != null) {
                inOrder(root.left);
                System.out.print(root.data + " ");
                inOrder(root.right);
            }
        }

        // Driver program to test above function 
        public static void main(String args[])
        {
            int arr[] = { 1, 2, 3, 4, 5, 6, 6, 6, 6 };
            root = insertLevelOrder(arr, root, 0);
            inOrder(root);
        }
}
