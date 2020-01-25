package problemSolving;

import java.util.Scanner;

public class DeleteNode {
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

    static SinglyLinkedListNode deleteNodeAtPosition(SinglyLinkedListNode head, int position) {

        SinglyLinkedListNode current = head; // old list store in current
        SinglyLinkedListNode previous = null;
        System.out.println(head.hashCode());
        System.out.println(head.next.hashCode());

        if (head == null) { // if head null and position is zero set at the head.
            return head;
        }
        if (position == 0) {
            return head.next;
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

        previous.next = current.next; //set the looped node to the new node.

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


        int position = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        SinglyLinkedListNode llist_head = deleteNodeAtPosition(llist.head, position);

        printSinglyLinkedList(llist_head);

        scanner.close();
    }
}
