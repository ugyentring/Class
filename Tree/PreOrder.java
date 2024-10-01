public class PreOrder {
    
    //node class
    public static class Node {
        String data;
        Node right;
        Node left;

        Node(String data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    //preorder method
    public static void preOrder(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data + ",");
        preOrder(node.left);
        preOrder(node.right);
    }


    public static void main(String[] args) {
        Node root = new Node("N");
        Node node1 = new Node("U");
        Node node2 = new Node("G");
        Node node3 = new Node("Y");
        Node node4 = new Node("E");
        Node node5 = new Node("N");
        Node node6 = new Node("D");
        Node node7 = new Node("P");




        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node1.right = node4;

        node2.left = node5;
        node2.right = node6;

        node6.left = node7;

        //travrseing
        preOrder(root);
    }
}
