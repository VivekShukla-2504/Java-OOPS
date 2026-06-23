public class DeleteKth {
    
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
    static void print(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
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
    static Node deleteKthNode(Node head, int k) {

    if (head == null)
        return null;

    Node temp = head;
    int count = 0;

    // Reach Kth node
    while (temp != null && count < k) {
        temp = temp.next;
        count++;
    }

    // Invalid K
    if (temp == null)
        return head;

    // Delete Head
    if (temp.back == null) {
        head = head.next;
        if (head != null)
            head.back = null;
    }

    // Delete Tail
    else if (temp.next == null) {
        temp.back.next = null;
    }

    // Delete Middle
    else {
        Node prev = temp.back;
        Node front = temp.next;

        prev.next = front;
        front.back = prev;
    }

    // Detach node (optional)
    temp.next = null;
    temp.back = null;

    return head;
}
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        Node head1 = convertArr2DLL(arr);
        System.out.println("Before deletion");
        print(head1);
        Node Kth = deleteKthNode(head1,4);
        System.out.println("After deletion");
        print(Kth);
        
    }
}
