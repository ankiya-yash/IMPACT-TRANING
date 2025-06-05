class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void removeLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " >> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}

public class linklist {
    public static void main(String[] args) {
        LinkedList Bucket = new LinkedList();
        Bucket.append(18);
        Bucket.append(45);
        Bucket.append(7);
        Bucket.append(10);
        Bucket.insertAtHead(99); 
        Bucket.printList();
        Bucket.removeLast(); 
        Bucket.printList();    
    }
}