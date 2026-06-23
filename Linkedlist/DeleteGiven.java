public class DeleteGiven {
    
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
static Node deleteNode(Node head, Node temp) {

    if (head == null || temp == null)
        return head;

    // Delete head
    if (temp == head) {
        head = head.next;
        if (head != null)
            head.back = null;

        temp.next = null;
        return head;
    }

    Node prev = temp.back;
    Node front = temp.next;

    prev.next = front;

    if (front != null)
        front.back = prev;

    

    return head;
}    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        Node head1 = convertArr2DLL(arr);
        System.out.println("Before deletion");
        print(head1);
        Node temp = head1.next.next.next; 
        Node Kth = deleteNode(head1,temp);
        System.out.println("After deletion");
        print(Kth);
        
    }
}
