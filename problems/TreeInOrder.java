package problems;

// Java program to demonstrate insert operation in binary search tree
class TreeInOrder {

    public static int countright = 0;
    public static int countleft = 0;

    /* Class containing left and right child of current node and key value*/
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    // Root of BST
    Node root;

    // Constructor
    TreeInOrder() {
        root = null;
    }

    // This method mainly calls insertRec()
    void insert(int key) {
        root = insertRec(root, key);
    }

    /* A recursive function to insert a new key in BST */
    Node insertRec(Node root, int key) {

        /* If the tree is empty, return a new node */
        if (root == null) {
            root = new Node(key);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        /* return the (unchanged) node pointer */
        return root;
    }

    // This method mainly calls InorderRec()
    void inorder() {
        inorderRec(root);
    }

    // A utility function to do inorder traversal of BST
    void inorderRec(Node root) {

        if (root != null) {
            //  # in order                          20 30 40 50 60 70 80
//            inorderRec(root.left);
//            System.out.print(root.key+" ");
            if (root.left != null) {
                inorderRec(root.left);
                countleft++;
            }
            if (root.right != null) {
                inorderRec(root.right);
                countright++;
            }


            //  # pre order                         50 30 20 40 70 60 80
//            System.out.print(root.key+" ");
//            inorderRec(root.left);
//            inorderRec(root.right);


            //  # post order                       20 40 30 60 80 70 50
//            inorderRec(root.left);
//            inorderRec(root.right);
//            System.out.print(root.key+" ");
        }
    }

    // Driver Program to test above functions
    public static void main(String[] args) {
        TreeInOrder tree = new TreeInOrder();

        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

//        tree.insert(1);
//        tree.insert(14);
//        tree.insert(3);
//        tree.insert(7);
//        tree.insert(4);
//        tree.insert(5);
//        tree.insert(15);
//        tree.insert(6);
//        tree.insert(13);
//        tree.insert(10);
//        tree.insert(11);
//        tree.insert(2);
//        tree.insert(12);
//        tree.insert(8);
//        tree.insert(9);
// 2 1 14 15 12
        // print inorder traversal of the BST
        tree.inorder();
        if (countleft > countright) {
            System.out.println(countleft);
        } else {
            System.out.println(countright);
        }
    }
}
