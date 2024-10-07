package BST;

class Node {
    int data;
    Node left;
    Node right;
    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

//binary searcg terr class
class BST {
    Node root;

  
}

class BSTMain {
    public static void main(String[] args) {
        BST bst = new BST();

        System.out.println(bst.root);
    }
}