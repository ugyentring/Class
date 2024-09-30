package withArray;

public class AStack {
    String[] arr;
    int height;

    AStack(int capacity) {
        arr = new String[capacity];
        height = 0;
    }

    //push method
    public void push(String value) {
        if (height == arr.length) {
            resize(arr.length * 2);
        }

        arr[height] = value;
        height++;
    }

    //pop
    public String pop() {

        String temp = arr[height - 1];
        arr[height - 1] = null;
        height--;

        if (height > 0 && height == arr.length / 4) {
            resize(arr.length / 2);
        }

        return temp;
    }

    //resize
    public void resize(int capacity) {
        String[] copyArr = new String[capacity];

        for (int i = 0; i < height; i++) {
            copyArr[i] = arr[i];
        }
        arr = copyArr;
    }






    //printStack method
    public void printStack() {
        for (int i = 0; i < height; i++) {
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {
        AStack class1 = new AStack(5);

        class1.push("hello");
        class1.push("hi");
        class1.push("bye");
        class1.push("messi");
        class1.push("life");
        class1.push("god");


        // System.out.println("Pop method: " + " " + class1.pop());


        System.out.println("Print the stack: ");
        class1.printStack();
        
    }
}
