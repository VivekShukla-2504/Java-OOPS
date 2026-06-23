public class ConvertArrayinLL {

    static class Node {
        int data;
        Node next;
        Node back;

        Node(int data1, Node next1, Node back1) {
            this.data = data1;
            this.next = next1;
            this.back = back1;
        }

        Node(int data1) {
            this.data = data1;
            this.next = null;
            this.back = null;
        }
    }

    // Convert Array to Doubly Linked List
    static Node convertArr2DLL(int[] arr) {

        if (arr.length == 0)
            return null;

        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {

            Node temp = new Node(arr[i], null, prev);

            prev.next = temp;
            prev = temp;
        }

        return head;
    }

    // Print DLL
    static void print(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        Node head = convertArr2DLL(arr);

        print(head);
    }
}