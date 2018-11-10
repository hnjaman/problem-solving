package ProblemSolving;

public class BinaryTree {

    // Root of Binary Tree


    // Constructors
//    BinaryTree(int key)
//    {
//        root = new Node(key);
//    }
//
//    BinaryTree()
//    {
//        root = null;
//    }

    public static boolean left=false;
    public static boolean right=false;

    public static boolean checkBST(Node root) {

        if (root == null) return false;

        if(root.left != null) {
            if (root.left.data > root.data) {
                left = true;
            } else {
                checkBST(root.left);
            }
        }

        if(root.right != null){
            if (root.right.data < root.data) {
                right = true;
            } else {
                checkBST(root.right);
            }
        }

        if(left || right)
            return false;
        else
            return true;
    }

    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        Node root;
        /*create root*/
        root = new Node(3);

        /* following is the tree after above statement

              1
            /   \
          null  null     */

        root.left = new Node(2);
        root.right = new Node(4);

        /* 2 and 3 become left and right children of 1
               1
             /   \
            2      3
          /    \    /  \
        null null null null  */


        root.left.left = new Node(1);
        /* 4 becomes left child of 2
                    1
                /       \
               2          3
             /   \       /  \
            4    null  null  null
           /   \
          null null
         */

        boolean result = checkBST(root);
        if(result){
            System.out.printf("YES");
        }else {
            System.out.printf("NO");
        }
    }
}
