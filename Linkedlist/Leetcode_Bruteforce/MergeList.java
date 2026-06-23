package Leetcode_Bruteforce;

public class MergeList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Merge two sorted linked lists
    static Node mergeTwoLists(Node list1, Node list2) {

        // If any list is empty
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        // Dummy node
        Node dummy = new Node(-1);
        Node temp = dummy;

        while (list1 != null && list2 != null) {

            if (list1.data <= list2.data) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }

            temp = temp.next;
        }

        // Attach remaining nodes
        if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }

        return dummy.next;
    }

    // Print Linked List
    static void printList(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // List 1
        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next = new Node(5);

        // List 2
        Node list2 = new Node(2);
        list2.next = new Node(4);
        list2.next.next = new Node(6);

        System.out.print("List 1: ");
        printList(list1);

        System.out.print("List 2: ");
        printList(list2);

        Node merged = mergeTwoLists(list1, list2);

        System.out.print("Merged List: ");
        printList(merged);
    }
}
