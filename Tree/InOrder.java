public class InOrder {
    //node
    public static class Node {
        String data;
        Node right;
        Node left;

        Node(String data) {
            this.data = data;
            this.right = null;
            this.left = null;

        }
    }
     
    //inorder method
    public static void inOrder(Node node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.data + ", ");
        inOrder(node.right);
    }

    public static void main(String[] args) {
        Node root = new Node("R");
        Node node1 = new Node("A");
        Node node2 = new Node("B");
        Node node3 = new Node("C");
        Node node4 = new Node("D");
        Node node5 = new Node("E");
        Node node6 = new Node("F");
        Node node7 = new Node("G");

        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node1.right = node4;

        node2.left = node5;
        node2.right = node6;

        node6.left = node7;

        //traverse
        inOrder(root);
    }
}
