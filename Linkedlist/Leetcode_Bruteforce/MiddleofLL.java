package Leetcode_Bruteforce;

public class MiddleofLL {

    // Definition of Node
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to find middle node (Brute Force)
    static Node middleNode(Node head) {

        Node temp = head;
        int count = 0;

        // Count total nodes
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int middle = count / 2;

        temp = head;

        // Move to the middle node
        while (middle > 0) {
            temp = temp.next;
            middle--;
        }

        return temp;
    }

    // Function to print linked list
    static void printList(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.print("Linked List: ");
        printList(head);

        Node middle = middleNode(head);

        System.out.println("Middle Node: " + middle.data);
    }
}
