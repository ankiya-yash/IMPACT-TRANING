class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;

    }
}
class Linklist{
    Node head;

    void insertAtPosition(int data, int pos){
        Node  newNode = new Node(data);
        if(pos ==0){
            newNode.next = head;
            head = newNode;
            return;

        }
        Node temp = head ;
        for(int i = 0 ; temp != null && )
    }
}



public class linkedlist2 {
    
}
