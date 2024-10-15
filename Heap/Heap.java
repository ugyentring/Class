import java.util.Arrays;

class Heap {
    int[] heap;
    int size;
    int capacity;

    public Heap(int capacity) {
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }

    // Get right child index
    private int getRightChildIndex(int pIndex) {
        return 2 * pIndex + 2;
    }

    // Get left child index
    private int getLeftChildIndex(int pIndex) {
        return 2 * pIndex + 1;
    }

    // Get parent index
    private int getParentIndex(int cIndex) {
        return (cIndex - 1) / 2;
    }

    // Swap elements in the heap
    private void swap(int index1, int index2) {
        int temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }

    // Insert a new value into the heap
    public void insert(int value) {
        if (size == capacity) {
            System.out.println("Heap is full. Cannot insert.");
            return;
        }

        heap[size] = value;
        size++;

        int currentIndex = size - 1;
        while (currentIndex > 0 && heap[currentIndex] > heap[getParentIndex(currentIndex)]) {
            swap(currentIndex, getParentIndex(currentIndex));
            currentIndex = getParentIndex(currentIndex);
        }
    }

    // Get the size of the heap
    public int length() {
        return size;
    }

    //Deletion of a value from the heap
    public int remove() {
        if (size == 0) {
            System.out.println("Heap is empty. Cannot remove.");
            return -1;
        }

        if (size == 1) {
            int temp = heap[0];
            heap[0] = 0;

            return temp;
        }

        int temp = heap[0];
        heap[0] = heap[size - 1];
        heap[size - 1] = 0;

        sinkDown(0);

        return temp;
    }

    public void sinkDown(int index) {
        int currentIndex = index;
        while (getLeftChildIndex(currentIndex) < size) {
            int leftIndex = getLeftChildIndex(index);
            int rightIndex = getLeftChildIndex(index);

            if (leftIndex < size && heap[leftIndex] > heap[currentIndex]) {
                currentIndex = leftIndex;
            }

            if (rightIndex < size && heap[rightIndex] > heap[currentIndex]) {
                currentIndex = rightIndex;
            }

            if (currentIndex != index) {
                swap(index, currentIndex);
                index = currentIndex;
            } else {
                return;
            }
        }
    }
}

class HeapMain {
    public static void main(String[] args) {
        Heap heap = new Heap(10);

        heap.insert(95);
        heap.insert(76);
        heap.insert(80);
        heap.insert(55);
        heap.insert(50);
        heap.insert(60);
        heap.insert(65);

        heap.remove();

        System.out.println(Arrays.toString(heap.heap));
    }
}
