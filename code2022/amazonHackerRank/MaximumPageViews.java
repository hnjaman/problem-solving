package code2022.amazonHackerRank;

import java.io.*;
import java.util.*;

class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}

class SinglyLinkedList {
    public SinglyLinkedListNode head;
    public SinglyLinkedListNode tail;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
        }

        this.tail = node;
    }
}

class SinglyLinkedListPrintHelper {
    public static void printList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }
}



class Result {
    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    public static int maximumPages(SinglyLinkedListNode head) {
        int max = 0;
        int current = head.data;
        int previousCurrent;
        head = head.next;
        while (head != null && head.data>= 0) {
            if(head.next == null && head.data>= 0) {
                previousCurrent = current;
                current = head.data;
                head.data = -1;
            } else {
                head = head.next;
            }
        }
        return max;
    }

}

public class MaximumPageViews {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        SinglyLinkedList head = new SinglyLinkedList();

        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            head.insertNode(llistItem);
        }

        int result = Result.maximumPages(head.head);
        scanner.close();
        System.out.println(result);
    }
}

// Submitted Answer

//    int max = 0;
//    ArrayList<Integer> list = new ArrayList<>();
//        while (head != null){
//                list.add(head.data);
//                head = head.next;
//                }
//                int length = list.size()/2;
//                for(int i=0; i<length; i++){
//        if(max<list.get(i)+list.get(list.size()-(i+1)))
//        max = list.get(i)+list.get(list.size()-(i+1));
//        }
//
//        return max;


//        while (head.next != null){
//                int tmp1 = head.data;
//                head = head.next;
//                while (head.next != null || head != null){
//                if(head.next == null){
//                if (max < tmp1 + head.data)
//        max = tmp1 + head.data;
//        head = null;
//        break;
//        } else if (head.next.next == null){
//        if (max < tmp1 + head.next.data)
//        max = tmp1 + head.next.data;
//
//        head.next = null;
//        break;
//        }
//        if(head.next != null)
//        head = head.next;
//        }
//        }