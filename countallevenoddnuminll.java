class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head;

    void append(int data){
        Node newnNode = new Node(data);
        if(head == null){
            head = newnNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnNode;
    }

    void printList() {
        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    void countEvenOdd(){
        int even = 0 , odd = 0;
        Node temp = head ;
        while(temp != null){
            if(temp.data %2 ==0)
                even++;
            else
                odd++;
            temp = temp.next;
        }
        System.out.println("Even count: " + even);
        System.out.println("Odd count: " + odd);
    }
    boolean search (int key){
        Node temp = head ;
        while(temp != null){
            if(temp.data == key){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}


public class countallevenoddnuminll {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(10);
        list.append(15);
        list.append(8);
        list.append(7);
        list.append(20);
        list.printList();
        list.countEvenOdd();
        
        int key = 0;
        if(list.search(key)){
            System.out.println(key +   ": is persent in the linkedlist");
        } else {
            System.out.println(key + ": is not persent in the linkedlist");
        }
    }
}