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

//binary search tree class
class BST {
    Node root;

    //insert method
    public boolean insert(int data) {
        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
            return true;
        }

        Node temp = root;
        while (true) {
            if (newNode.data == temp.data) {
                return false;
            }

            if (newNode.data < temp.data) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }

    }
}

class BSTMain {
    public static void main(String[] args) {
        BST bst = new BST();

        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(27);
        bst.insert(52);
        bst.insert(82);
        bst.insert(27);

        System.out.println(bst.root.data);
    }
}