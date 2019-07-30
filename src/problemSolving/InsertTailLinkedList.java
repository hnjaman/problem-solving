package problemSolving;

import java.util.Scanner;

public class InsertTailLinkedList {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;
        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }

        public SinglyLinkedListNode() {

        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedList() {
            this.head = null;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node) {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        if (head == null){
            head = new SinglyLinkedListNode(data);
         //   head.data = data;
        }else {
            SinglyLinkedListNode node = head;
            while (node.next != null){
                node = node.next;
            }
            node.next = new SinglyLinkedListNode(data);
           // node.next.data = data;
        }
        return head;
    }

    public static SinglyLinkedListNode makeLinkedList(SinglyLinkedListNode listnode1, SinglyLinkedListNode listnode2){
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        do {
            s1.append(listnode1.data);
            listnode1 = listnode1.next;
        }
        while(listnode1.next != null);
        do {
            s2.append(listnode2.data);
            listnode2 = listnode2.next;
        }
        while(listnode2.next != null);

        String ss1 = new String(s1.reverse());
        String ss2 = new String(s2.reverse());
        Integer result  = Integer.parseInt(new String(new StringBuilder(Integer.parseInt(ss1) + Integer.parseInt(ss2)).reverse()));

        SinglyLinkedListNode resultNode = null;
        int d = result/10;
        int r = result%10;

        while (d>0){
            if (resultNode == null){
                resultNode = new SinglyLinkedListNode(r);
            }else {
                resultNode.next.data=r;
            }
        }
        return resultNode;
    }

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        SinglyLinkedList singlyLinkedList_1 = new SinglyLinkedList();
        int[] elements_1 = {2,4,3};
        int[] elements_2 = {5,6,4};
        SinglyLinkedListNode listNode_1=null;
        SinglyLinkedListNode listNode_2=null;

        int noOfElements_1 = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < noOfElements_1; i++) {
            int data = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            listNode_1 = insertNodeAtTail(singlyLinkedList_1.head, data);
            singlyLinkedList_1.head = listNode_1;
        }
        System.out.println("next list");
        SinglyLinkedList singlyLinkedList_2 = new SinglyLinkedList();
        int noOfElements_2 = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < noOfElements_2; i++) {
            int data = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            listNode_2 = insertNodeAtTail(singlyLinkedList_2.head, data);
            singlyLinkedList_2.head = listNode_2;
        }
        makeLinkedList(listNode_1,listNode_2);
        //printSinglyLinkedList(singlyLinkedList.head);
    }
}
