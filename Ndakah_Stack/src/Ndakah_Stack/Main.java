package Ndakah_Stack;

/*
Stack is an abstract data type with a bounded(predefined) capacity.
It is a simple data structure that allows adding and removing elements in a particular order.
Every time an element is added, it goes on the top of the stack and the only element that
can be removed is the element that is at the top of the stack, just like a pile of objects.
 */

class Stack {

    // Storing elements of the stack
    private final int[] arr;
    // Top of the stack
    private int top;
    // Total capacity of the stack
    private final int capacity;

    // Creating the stack
    Stack(int size) {
        // Initialize the array
        // Initialize the stack variables
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // now we push elements to the top of stack
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack OverFlow");

            // This line terminates the program
            System.exit(1);
        }

        // for inserting element on top of stack
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    // for popping elements from top of stack
    public void pop() {

        // if the stack is empty there would be no element to pop
        if (isEmpty()) {
            System.out.println("STACK EMPTY");
            System.exit(1);
        }

        // the line pops element from top of stack
        top--;
    }

    // Let's check if the stack is empty
    public Boolean isEmpty() {
        return top == -1;
    }

    // Now Let's check if the stack is full
    public Boolean isFull() {
        return top == capacity - 1;
    }

    // Now let's display elements of stack
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(2);
        stack.push(12);
        stack.push(6);

        System.out.print("Stack: ");
        stack.printStack();

        // Let's remove an element from stack
        stack.pop();
        System.out.println("\nAfter popping out");
        stack.printStack();


    }
}