
import javax.swing.SpringLayout;

 class Node{
    
    int data;
    Node pre;
    Node next;

    public Node(int data){

        this.data= data;
        this.pre = null;
        this.next = null;
    }
}

class doublylinkedlist{
    
    Node head;

    void append(int data){

        Node newNode = new Node(data);
        if(head  == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.pre = head;
    }
    void Showlist(){

    Node temp = head;
    while(temp != null){
        System.out.print(temp.data + ">>");
        temp = temp.next;
    }

    System.out.println("Null");

}


}


public class doublelinkedlist {

    public static void main(String[] args) {

        doublylinkedlist Bucket = new doublylinkedlist();

        Bucket.append(10);
        Bucket.append(20);
        Bucket.append(30);
        Bucket.append(40);
        Bucket.Showlist();

    }
}
