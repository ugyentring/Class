package withArray;

public class Stack {
    int[] stack;
    int top;


    Stack(int size) {
        stack = new int[size];
        top = -1;
    }

    //push
    void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack is full");
        } else {
            stack[++top] = value;
        }
    }

    //pop
    int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack[top--];
        }
    }

    //peek
    int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack[top];
        }
    }

    //printStack
    void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i]);
        }
    }


    public static void main(String[] args) {

        Stack class1 = new Stack(5);

        class1.push(1);
        class1.push(2);
        class1.push(3);
        class1.push(4);
        class1.push(5);

        class1.pop();
        class1.peek();


        class1.printStack();
    }
}
