package problems;

public class BST2 {

    public static boolean left = false;
    public static boolean right = false;

    public static boolean checkBST(Node root) {

        String r = Integer.toString(root.data);

        if (root == null) return false;

        if (root.left != null) {
            if (root.left.data > root.data || root.left.data < Integer.parseInt(r)) {
                left = true;
            } else {
                checkBST(root.left);
            }
        }

        if (root.right != null) {
            if (root.right.data < root.data || root.right.data > Integer.parseInt(r)) {
                right = true;
            } else {
                checkBST(root.right);
            }
        }

        if (left || right)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        Node root;
        /*create root*/
        root = new Node(20);

        root.left = new Node(5);
        root.right = new Node(25);


        root.left.left = new Node(1);
        // root.left.right = new Node(100);

        root.right.right = new Node(30);

        /* 4 becomes left child of 2
                    20
                /       \
               5         25
             /   \       /  \
            1    100  null  30
         */
        boolean result = checkBST(root);
        if (result) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
