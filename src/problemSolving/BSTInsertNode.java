package problemSolving;

import java.util.Scanner;

public class BSTInsertNode {
    public static void preOrder( Node root ) {

        if( root == null)
            return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    public static boolean left=false;
    public static boolean right=false;

    public static boolean checkBST(Node root) {

        if (root == null) return false;         // only for first node check

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
                checkBST(root.right);   // 3
            }
        }

        if(left || right)              // return processing
            return false;
        else
            return true;
    }

    public static Node insert(Node root,int data) {

        if(root == null){
            return new Node(data);
        }else{
            Node bst;
            if(root.data>data){
                bst=insert(root.left, data);
                root.left=bst;
            }else if(root.data<data){
                bst=insert(root.right, data);
                root.right=bst;
            }
        }
        return root;   // 4 2 1 3 7 6
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        boolean result = checkBST(root);
        if(result){
            System.out.printf("YES");
        }else {
            System.out.printf("NO");
        }
    }
}