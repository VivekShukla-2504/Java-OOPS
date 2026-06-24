package Leetcode_Bruteforce;

public class Intersectionof2LL {

    // Node class
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Brute Force Approach
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode a = headA;

        while (a != null) {

            ListNode b = headB;

            while (b != null) {

                if (a == b) {   // Compare references, not values
                    return a;
                }

                b = b.next;
            }

            a = a.next;
        }

        return null;
    }

    // Print Linked List
    public static void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.val);

            if (head.next != null) {
                System.out.print(" -> ");
            }

            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // Common Part
        ListNode common = new ListNode(8);
        common.next = new ListNode(4);
        common.next.next = new ListNode(5);

        // List A: 4 -> 1 -> 8 -> 4 -> 5
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = common;

        // List B: 5 -> 6 -> 1 -> 8 -> 4 -> 5
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = common;

        System.out.print("List A: ");
        printList(headA);

        System.out.print("List B: ");
        printList(headB);

        ListNode intersection = getIntersectionNode(headA, headB);

        if (intersection != null) {
            System.out.println("\nIntersection Node: " + intersection.val);
        } else {
            System.out.println("\nNo Intersection");
        }
    }
}