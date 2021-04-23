package Ndakah_D_L_List;

/*
Doubly Linked List is a variation of Linked list in which navigation is possible in both ways,
either forward and backward easily as compared to Single Linked List.
Following are the important terms to understand the concept of doubly linked list.

Link − Each link of a linked list can store a data called an element.
Next − Each link of a linked list contains a link to the next link called Next.
Prev − Each link of a linked list contains a link to the previous link called Prev.
LinkedList − A Linked List contains the connection link to the first link called First and to the last link called Last.
 */


class DoublyLinkedList {
    //A node class for doubly linked list
    static class Node {
        int item;
        Node previous;
        Node next;

        public Node(int item) {
            this.item = item;
        }
    }

    //Initially, headed and tail is set to null
    Node head, tail = null;

    //add a node to the list
    public void addNode(int item) {
        //Create a new node
        Node newNode = new Node(item);

        //if list is empty, head and tail points to newNode
        if (head == null) {
            head = tail = newNode;
            //head's previous will be null
            head.previous = null;
            //tail's next will be null
        } else {
            //add newNode to the end of list. tail->next set to newNode
            tail.next = newNode;
            //newNode->previous set to tail
            newNode.previous = tail;
            //newNode becomes new tail
            tail = newNode;
            //tail's next point to null
        }
        tail.next = null;
    }

    //print all the nodes of doubly linked list
    public void printNodes() {
        //Node current will point to head
        Node current = head;
        if (head == null) {
            System.out.println("Doubly linked list is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while (current != null) {
            //Print each node and then go to next.
            System.out.print(current.item + " ");
            current = current.next;
        }
    }
}

class Main {
    public static void main(String[] args) {
        //create a DoublyLinkedList object
        DoublyLinkedList dl_List = new DoublyLinkedList();
        //Add nodes to the list
        dl_List.addNode(132);
        dl_List.addNode(262);
        dl_List.addNode(111);
        dl_List.addNode(90);
        dl_List.addNode(114);

        //print the nodes of DoublyLinkedList
        dl_List.printNodes();
    }
}