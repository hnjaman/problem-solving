package problemSolving;

import java.util.Scanner;

public class InsertInPositionLinkedList {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
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

    public static void printSinglyLinkedList(SinglyLinkedListNode node) {
        while (node != null) {
            System.out.print(node.data);
            node = node.next;
            if (node != null) {
                System.out.print(" ");
            }
        }
    }

    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data); //create a new node
        SinglyLinkedListNode current = head; // old list store in current
        SinglyLinkedListNode previous = null;
        if (head == null && position == 0) { // if head null and position is zero set at the head.
            head = newNode;
        }
        if (position == 0) { // if position is zero then new node set at the head.
            newNode.next = head;
            head = newNode;
        }
        int count = 0;
        int i = 0;
        while (i < position) { //loop until find the given position.
            previous = current;
            current = current.next;
            if (current.next == null)
                break;
            i++;
        }
        newNode.next = current; //get the new node and linked the remaining nodes in the list.
        previous.next = current; //set the looped node to the new node.
        return head;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SinglyLinkedList llist = new SinglyLinkedList();
        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            llist.insertNode(llistItem);
        }
        int data = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int position = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        SinglyLinkedListNode llist_head = insertNodeAtPosition(llist.head, data, position);
        printSinglyLinkedList(llist_head);
        scanner.close();
    }
}
