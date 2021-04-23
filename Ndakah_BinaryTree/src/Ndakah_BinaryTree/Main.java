package Ndakah_BinaryTree;

/*
A binary tree is a hierarchical data structure in which each node has at most two children
generally referred as left child and right child.
Each node contains three components:
Pointer to left subtree
Pointer to right subtree
Data element
The topmost node in the tree is called the root. An empty tree is represented by NULL pointer.
 */


class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    // This method is for the Traverse Preorder
    public void tPreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.key);
            tPreOrder(node.left);
            tPreOrder(node.right);
        }
    }

    // This method is for the Traverse Postorder
    public void tPostOrder(Node node) {
        if (node != null) {
            tPostOrder(node.left);
            tPostOrder(node.right);
            System.out.print(" " + node.key);
        }
    }

    // This method is for the Traverse Inorder
    public void tInOrder(Node node) {
        if (node != null) {
            tInOrder(node.left);
            System.out.print(" " + node.key);
            tInOrder(node.right);
        }
    }



    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);

        System.out.print("The Pre Order Traversal: ");
        tree.tPreOrder(tree.root);
        System.out.print("\nThe In Order Traversal: ");
        tree.tInOrder(tree.root);
        System.out.print("\nThe Post Order Traversal: ");
        tree.tPostOrder(tree.root);
    }
}

