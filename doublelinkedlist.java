class Node {
    int data;
    Node pre;
    Node next;

    public Node(int data) {
        this.data = data;
        this.pre = null;
        this.next = null;
    }
}

class doublylinkedlist {
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
        newNode.pre = temp; 
    }

    void Showlist() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + ">>");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    void Backward() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        
        while (temp != null) {
            System.out.print(temp.data + "<<");
            temp = temp.pre;
        }
        System.out.println("Null");
    }

    void InseretAtBeginning(int data){

        Node newNode = new Node(data);
        newNode.next = head;
        head.pre = newNode;
        head = newNode;

    }
    void InseretAtEnd(int pos,int data){

        Node newNode = new Node( data);
        if (pos == 0){
            InseretAtBeginning(data);
        }
        Node temp = head;
        for(int i = 0 ; temp != null && i<pos-1; i++){

            temp=temp.next;
        }
        if(temp == null){
            System.out.println("not reacherable");
        }
        newNode.next = temp.next;
        newNode.pre = temp;
        if (temp.next == null) {
            temp.next.pre = newNode;
        }
        temp.next= newNode;
    }
    void Removehead(){
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        head = head.next;
        head.pre = null;
    }
 
}

public class doublelinkedlist {
    public static void main(String[] args) {
        doublylinkedlist Bucket = new doublylinkedlist();
        Bucket.append(10);
        Bucket.append(20);
        Bucket.append(30);
        Bucket.append(40);
        //Bucket.Showlist();    
        Bucket.Backward();  
        Bucket.InseretAtBeginning(9); 
        Bucket.Showlist(); 
        Bucket.InseretAtEnd(2, 12);
        Bucket.Showlist();
        Bucket.Removehead();
        Bucket.Showlist();
    }
}