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

class BST {
    Node root;

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

    public Node delete(Node root, int key) {
        if (root == null) {
            return null;
        }

        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.data = minValue(root.right);
            root.right = delete(root.right, root.data);
        }

        return root;
    }

    public int minValue(Node root) {
        int minValue = root.data;
        while (root.left != null) {
            root = root.left;
            minValue = root.data;
        }
        return minValue;
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

        bst.root = bst.delete(bst.root, 21);

        System.out.println(bst.root.left.data);
    }
}
