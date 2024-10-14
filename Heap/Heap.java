//Heap data structure implementation

class Heap {
    int[] arr;
    int size;
    int capacity;

    public Heap(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        size = 0;
    }

    //level order traversal
    public void levelOrder() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    //length of heap
    public int length() {
        return size;
    }


   
    
    public static void main(String[] args) {
        
    }
}