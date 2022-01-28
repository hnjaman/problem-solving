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
        int first = 0;
        int last = 0;
        SinglyLinkedListNode copyHead;
        SinglyLinkedListNode headBackup;

            copyHead = head;
            first = head.data;
            headBackup = head;
            while (copyHead != null){
                if(copyHead.next == null && copyHead.data >= 0){
                    last = copyHead.data;
                    copyHead.data = Integer.MIN_VALUE;
                    break;
                } else if(copyHead.data > 0){
                    if(copyHead.next.data < 0) {
                        last = copyHead.data;
                        copyHead.data = Integer.MIN_VALUE;
                    }
                }
                copyHead = copyHead.next;
                if(first+last > max){
                    max = head.data + last;
                }
            }

            head = headBackup;

        return max;
    }

//    My solve *************************

//    public static int maximumPages(SinglyLinkedListNode head) {
//        int max = 0;
//        int last = 0;
//        SinglyLinkedListNode copyHead;
//        SinglyLinkedListNode headBackup;
//
//        while (head != null) {
//            copyHead = head.next;
//            headBackup = head.next;
//            while (copyHead != null){
//                if(copyHead.next == null && copyHead.data >= 0){
//                    last = copyHead.data;
//                    copyHead.data = Integer.MIN_VALUE;
//                    break;
//                } else if(copyHead.data > 0){
//                    if(copyHead.next.data < 0) {
//                        last = copyHead.data;
//                        copyHead.data = Integer.MIN_VALUE;
//                    }
//                }
//                copyHead = copyHead.next;
//            }
//            if(head.data+last > max){
//                max = head.data + last;
//            }
//
//            head = headBackup;
//        }
//        return max;
//    }

    public static int pairSum(SinglyLinkedListNode head) {
        SinglyLinkedListNode middle = getMiddleNode(head);

        SinglyLinkedListNode secondHead = middle.next;
        middle.next = null;

        SinglyLinkedListNode firstHead = reverse(head);

        return findMaxSum(firstHead, secondHead);
    }

    public static SinglyLinkedListNode getMiddleNode(SinglyLinkedListNode head) {
        int size = getSize(head);

        SinglyLinkedListNode current = head;
        for (int index = 0; index < (size / 2) - 1; index++) {
            current = current.next;
        }
        return current;
    }

    public static int getSize(SinglyLinkedListNode head) {
        int size = 0;
        SinglyLinkedListNode current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        SinglyLinkedListNode previous = null;
        SinglyLinkedListNode current = head;
        while (current != null) {
            SinglyLinkedListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;
    }

    public static int findMaxSum(SinglyLinkedListNode firstHead, SinglyLinkedListNode secondHead) {
        int maxSum = Integer.MIN_VALUE;
        while (firstHead != null) {
            maxSum = Math.max(maxSum, firstHead.data + secondHead.data);
            firstHead = firstHead.next;
            secondHead = secondHead.next;
        }

        return maxSum;
    }

    public static SinglyLinkedListNode reverse2(SinglyLinkedListNode node) {
        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode current = node;
        SinglyLinkedListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
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
//        int result = Result.pairSum(head.head);
        scanner.close();
        System.out.println(result);
    }
}

// Submitted Answer

//    int max = 0;
//    ArrayList<Integer> list = new ArrayList<>();
//        while (head != null){
//          list.add(head.data);
//          head = head.next;
//        }
//        int length = list.size()/2;
//        for(int i=0; i<length; i++){
//          if(max<list.get(i)+list.get(list.size()-(i+1)))
//          max = list.get(i)+list.get(list.size()-(i+1));
//        }
//
//    return max;


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