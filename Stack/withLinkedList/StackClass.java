package withLinkedList;

public class StackClass {
    
    Node top;
    int height;

    // constructor
    public StackClass() {
        this.top = null;
        this.height = 0;
    }

    // push method
    public void push(String value) {
        Node node1 = new Node(value);

        if (top == null) {
            top = node1;
        } else {
            node1.next = top;
            top = node1;
        }
        height++;
    }

    //pop method
    public Node pop() {
        if (top == null) {
            return null;
        }

        Node temp = top;

        top = temp.next;
        temp.next = null;
        height--;
        return temp;

    }
    
    //peek method
    public String peek() {
        return top.value;
    }

    //get top method
    public String getTop() {
        return top.value;
    }

    //get height
    public int getHeight() {
        return height;
    }

    //printStack method
    public void printStack() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value + " ");
            temp = temp.next;
        }
    }

    //isEmpty
    public boolean isEmpty() {
        return top == null;
    }
   
    //delete stack
    public void deleteStack() {
        top = null;
    }

    public static void main(String[] args) {
        StackClass class1 = new StackClass();

        class1.push("Alchemist");
        class1.push("Atomic");
        class1.push("Light");
        class1.push("Bhutan");


        System.out.println("Get top method:"+ " "+ class1.getTop());
        System.out.println("Get height method: " + " " + class1.getHeight());


        System.out.println();


        // System.out.println("Pop method: " + " " + class1.pop());
        System.out.println("Peek method: " + " " + class1.peek());

        System.out.println();


        System.out.println("Is empty method: " + " " + class1.isEmpty());

        System.out.println();


        // class1.deleteStack();
        // System.out.println();

        System.out.println("Print stack method: ");
        class1.printStack();        

    }
}
