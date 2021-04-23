package Ndakah_S_L_List;

/*
Singly Linked Lists are a type of data structure. A linked list provides an alternative to an array-based structure.
A linked list, in its simplest form, in a collection of nodes that collectively form linear sequence.
In a singly linked list, each node stores a reference to an object that is an element of the sequence,
as well as a reference to the next node of the list. It does not store any pointer or reference to the previous node.
To store a single linked list, only the reference or pointer to the first node in that list must be stored.
The last node in a single linked list points to nothing.
 */

class SinglyLinkedList {
    //Represent a node of the singly linked list
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Represents the head and tail of the singly linked list
    public Node head = null;
    public Node tail = null;

    //addNode() will add a new node to the list
    public void numberAdd(int data) {
        //Create a new node
        Node newNode = new Node(data);

        //Checks if the list is empty
        if(head == null) {
            //If list is empty, both head and tail will point to new node
            head = newNode;
        }
        else {
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            //newNode will become new tail of the list
        }
        tail = newNode;
    }

    //display() will display all the nodes present in the list
    public void display() {
        //Node current will point to head
        Node current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list:\n ");
        while(current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next=head;
        head=new_node;
    }
    public void insertAfter(Node prev_node, int data){

        if(prev_node ==null){
            System.out.println("The given node cannot be null");
            return;
        }
        Node new_node= new Node(data);
        new_node.next=prev_node.next;
        prev_node.next=new_node;

    }
    //Deleting via the recursive method.
    public void deleteNode(int key)
    {
        // Store head node
        Node temp = head, prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next; // Changed head
            return;
        }

        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null)
            return;

        // Unlink the node from linked list
        prev.next = temp.next;
    }

    public void insertAtEnd(int data){

        Node new_node = new Node(data);

        if (head == null) {
            head = new Node(data);
            return;
        }

        new_node.next = null;

        Node last = head;
        while (last.next != null)
            last = last.next;

        last.next = new_node;
    }



    public static void main(String[] args) {

        SinglyLinkedList lList = new SinglyLinkedList();

        //Add nodes to the list
        lList.numberAdd(41);
        lList.numberAdd( 17);
        lList.numberAdd(55);
        lList.numberAdd(23);
        lList.numberAdd(5);
        lList.numberAdd(8);

        //Displays the nodes present in the list
        lList.display();

        System.out.println("List after inserting 1 in front");
        lList.push(1);
        lList.display();

        System.out.println("List after inserting 25 after node 23");
        lList.insertAfter(lList.head.next.next.next.next, 25);
        lList.display();

        System.out.println("List after deleting node 5");
        lList.deleteNode(5);
        lList.display();

        System.out.println("List after adding 74 after node 17");
        lList.insertAfter(lList.head.next.next,74);
        lList.display();

        System.out.println("List after inserting 89 at the end");
        lList.insertAtEnd(89);
        lList.display();

        System.out.println("List after deleting node 8");
        lList.deleteNode(8);
        lList.display();


    }
}