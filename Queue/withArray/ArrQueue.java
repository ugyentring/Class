package withArray;

public class ArrQueue {
    int[] queue;
    int front;
    int rear;
    int size;

    public ArrQueue(int size) {
        queue = new int[size];
        front = 0;
        rear = 0;
        this.size = size;
    }

    //enqueue method
    void enqueue(int value) {
        if (rear == size) {
            System.out.println("Queue is full");
            return;
        } else {
            queue[rear] = value;
            rear++;
        }
    }

    //dequeue method
    int dequeue() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int value = queue[front];
            front++;
            return value;
        }
    }
    
    //peek
    int peek() {
        return queue[front];
    }
}
