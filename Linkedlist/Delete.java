public class Delete {
    
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
    static Node deleteHead(Node head) {
    if (head == null || head.next == null)
        return null;

    head = head.next;
    head.back = null;
    return head;
    }
    static Node deleteTail(Node head)
    {
        if (head == null || head.next == null)
        return null;
        Node tail = head;
        while(tail.next!=null)
        {
           tail = tail.next;
        }
        Node prev = tail.back;
        prev.next=null;
        tail.back = null;
        return head;
    }
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        Node head1 = convertArr2DLL(arr);
        System.out.println("Before deletion");
        print(head1);
        Node head = deleteHead(head1);
        System.out.println("After deletion");
        print(head);
        Node tail = deleteTail(head1);
        System.out.println("After deletion");
        print(tail);
    }
}
