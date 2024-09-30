package withArray;

class Node{
    char value;
    Node next;

    Node(char value) {
        this.value = value;
        this.next = null;
    }
}

public class CharStack {
    Node top;
    int height;

    public CharStack() {
        top = null;
        height = 0;
    }

    //push
    public void push(char value) {
        Node node1 = new Node(value);

        if (top == null) {
            top = node1;
        } else {
            node1.next = top;
            top = node1;
        }
        height++;
    }

    //pop
    public Node pop() {
        if (height == 0)
            return null;

        Node temp = top;

        top = temp.next;
        temp.next = null;
        height--;
        return temp;
    }

    //printStack
    public void printStack() {
        Node temp = top;

        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    
}
