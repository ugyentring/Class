package withStack;
public class Queue {

    Node first;
    Node last;
    int length;
    
    //Node class
    public class Node {
        String value;
        Node next;

        Node(String value) {
            this.value = value;
            this.next = null;
        }
    }

    //constructor
    public Queue(String value) {
        Node newNode = new Node(value);
        this.first = newNode;
        this.last = newNode;
        length = 1;
    }

    //printQueue method
    public void printQueue() {
        if (first == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node temp = first;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

    //enqueue method - add to end
    public void enqueue(String value) {
        Node newNode = new Node(value);

        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    //depueue method  
    //Time complexity O(1) because we are only using a constant amount of operations
    //Space complexity O(1) because we are not using any additional space that scales with the input size
    public Node dequeue() {
        if (first == null) {
            return null;
        }

        Node temp = first;
        first = first.next;

        if (first == null) {
            last = null;
        }
        length--;
        return temp;
    }
    
    //isEmpty
    public boolean isEmpty() {
        return first == null;
    }
    
    //peek method
    public Node peek() {
        return first;
    }

    //delete queue method
    public void deleteQueue() {
        first = null;
        last = null;
        length = 0;
    }
    


    public static void main(String[] args) {

        Queue queue = new Queue("First");

        System.out.print("Enqueue: ");
        queue.enqueue("second");
        queue.enqueue("third");
        queue.enqueue("fourth");

        // queue.dequeue();

        System.out.println("Peek: " + queue.peek().value);

        System.out.println();
        System.out.println("Is queue empty?: " + queue.isEmpty());

        //delete queue method
        // queue.deleteQueue();
        queue.printQueue();
      
    }

}