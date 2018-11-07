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
        if (root != null) {
            if(root.left != null){
                height(root.left);
                countleft++;
            }

            if(root.right != null){
                height(root.right);
                countright++;
            }
        }
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
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        int height = height(root);
        System.out.println(height);
    }
}
