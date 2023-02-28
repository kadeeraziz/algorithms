package Java;



public class SinglyLinked {

    Node head;
    
    public boolean isEmpty(){
        return head == null;
    }

    public static void main(String [] args){
        System.out.println("Hello World");
        // print the head
        SinglyLinked list = new SinglyLinked();
        System.out.println(list.isEmpty());
    }
}


class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}






