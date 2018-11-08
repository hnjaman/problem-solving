package ProblemSolving;
import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
public class TreeHeight {

    public static int countright=0;
    public static int countleft=0;

    public static int height(Node root) {
        if(root == null){
            return -1;
        }

        int countleft = 1 + height(root.left);
        int countright = 1 + height(root.right);

////        else{
//          //  if(root.left != null){
//                countleft++;
//                height(root.left);
////                    if(root.left != null && root.right == null)
////                        countright++;
//           // }
//
//           // if(root.right != null){
//                countright++;
//                height(root.right);
////                    if(root.right != null && root.left == null)
////                        countleft++;
//           // }
// //       }

        if (countleft>countright)
            return countleft;
        else
            return countright;
    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {                    // o(t)
            int data = scan.nextInt();
            root = insert(root, data);      // o(n) recurtion
        }
        scan.close();
        int height = height(root);          // o(n) recurtion
        System.out.println(height);
    }
}


//        if (root != null) {               // ### can be used as left, right count
//            if(root.left != null){
//                height(root.left);
//                countleft++;
//            }
//
//            if(root.right != null){
//                height(root.right);
//                countright++;
//            }
//        }

//3 2 5 1 4 6 7