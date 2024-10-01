public class Tree {

    //Node class
    public class Node {
        Node right;
        Node left;
        int data;

        Node(int data) {
            this.data = data;
        }
    }

    public Node root;

    //constructor
    public Tree(int data) {
        root = new Node(data);
    }

    public static void main(String[] args) {
        
        
    }
}