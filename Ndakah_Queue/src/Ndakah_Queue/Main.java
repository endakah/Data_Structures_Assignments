package Ndakah_Queue;

/*
Queue is an abstract data structure, somewhat similar to Stacks.
Unlike stacks, a queue is open at both its ends.
One end is always used to insert data (enqueue) and the other
is used to remove data (dequeue). Queue follows First-In-First-Out
methodology, eg: the data item stored first will be accessed first.
 */

class Queue {
    int SIZE = 6;
    int[] items = new int[SIZE];
    int front, rear;

    Queue() {
        front = -1;
        rear = -1;
    }

    // Let's to Check see if the queue isFull
    boolean isFull() {
        return front == 0 && rear == SIZE - 1;
    }

    //now let's check if the queue is empty

    boolean isEmpty() {
        return front == -1;
    }

// we have to mark front to denote first element of queue

    void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1)
                front = 0;
            rear++;
            items[rear] = element;
            System.out.println("Inserted " + element);
        }
    }

    void deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            element = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println("Deleted -> " + element);
        }
    }

    void display() {
        /* This Function will display elements of Queue */
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("\nFront index-> " + front);
            System.out.println("Items -> ");
            for (i = front; i <= rear; i++)
                System.out.print(items[i] + "  ");

            System.out.println("\nRear index-> " + rear);
        }
    }

    public static void main(String[] args) {
        Queue que = new Queue();

        // we cannot deQueue empty queue
        que.deQueue();

        // now we enQueue 6 elements
        que.enQueue(45);
        que.enQueue(6);
        que.enQueue(25);
        que.enQueue(11);
        que.enQueue(2);
        que.enQueue(3);

        // 7th element can't be added to because the queue is full
        que.enQueue(7);

        que.display();

        // deQueue removes element entered first which is 45 in this case
        que.deQueue();

        // now we have just 5 elements
        que.display();

    }
}