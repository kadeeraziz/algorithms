package Java;

// what is a linked list?
// a linked list is a linear data structure where each element is a separate object 
// each element (we will call it a node) of a list is comprising of two items - the data and a reference to the next node
// the last node has a reference to null

// Linked list is a linear data structure. Unlike array each element is not stored at a contiguous location; the elements are linked using pointers.

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}



public class LinkedLists {
    // by default head is null
    Node head;

    public static LinkedLists insert(LinkedLists list, int data){
        // create a new node with given data
        Node newNode = new Node(data);
        newNode.next = null;

        // if the linked list is empty, make the new node as head
        if(list.head == null){
            list.head = newNode;
        } else {
            // else traverse till the last node and insert the new node there
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }

            // insert the new node at last node
            last.next = newNode;
        }

        // return the list by head
        return list;
    }

    // method to print the linked list
    public static void printList(LinkedLists list){
        Node currentNode = list.head;

        System.out.print("LinkedList: ");

        // traverse through the linked list
        while(currentNode != null){
            // print the data at current node
            System.out.print(currentNode.data + " ");

            // go to next node
            currentNode = currentNode.next;
        }
    
    }

    public static void main(String[] args) {
        LinkedLists list = new LinkedLists();

        // insert some values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);

        // print the linked list
        printList(list);
    }

    

}
