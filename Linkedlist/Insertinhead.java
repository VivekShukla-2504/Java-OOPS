public class Insertinhead {

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
    static Node insertTail(Node head,int val)
   {
    Node newNode = new Node(val);
    Node temp = head;
    if (head == null)
        return newNode;
    while(temp.next!=null)
    {
        temp = temp.next;
    }
    temp.next = newNode;
    newNode.back = temp;
    return head;

   }
    static Node insertHead(Node head, int val) {

    Node newNode = new Node(val);

    if (head == null)
        return newNode;
    newNode.next = head;
    head.back = newNode;
    return newNode;
   }
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        Node head = convertArr2DLL(arr);

        print(head);
        Node insert = insertHead( head, 5);
        print(insert);
        Node insertTail = insertTail( head, 5);
        print(insertTail);
    }
}
