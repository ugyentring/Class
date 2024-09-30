public class Tree {
    public Node root;

    public class Node {
        Node right;
        Node left;
        int data;

        Node(int data) {
            this.data = data;
        }
    }


    //constructor
    public Tree(int data) {
        root = new Node(data);
    }

    public static void main(String[] args) {
        
        
    }
}