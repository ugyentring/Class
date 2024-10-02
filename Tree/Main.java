//node class
class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

//binary tree class
class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    //inorder traversal  4 2 5 1 3 7
    //callstack 1 2 4 5 3 7
    public void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.value + " ");
        inorder(node.right);
    }

    //preorder traversal 1 2 4 5 3 7
    //callstack 1 2 4 5 3 7
    public void preorder(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }

    //postorder traversal 4 5 2 7 3 1
    //callstack 4 5 2 7 3 1
    public void postorder(Node node) {
        if (node == null) {
            return;
        }

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value + " ");
    }
}

public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n7 = new Node(7);

        bt.root = n1;
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.right = n7;

        // bt.inorder(n1);
        // bt.preorder(n1);
        bt.postorder(n1);
    }
    
}
