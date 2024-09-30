public class LinkedListExample {

    Node head;
    Node tail;
    int length;

    
    LinkedListExample() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    //node 1
    public void ListNode() {
        Node newNode = new Node(20);
        head = newNode;
        tail = newNode;
    }

    //node 2
    //prepend method to add new node
    public void prepend(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }
     //node 3
    //append method to add new node at the end
    public void append(int value) {
        Node newNode = new Node(value);

        if (tail == null) {
            tail = newNode;
            head = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }
   
    //print method
    public void printLinkedList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }
        
    //insert method
    public boolean insert(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        }

        if (index == 0) {
            prepend(value);
            return true;
        }

        if (index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node current = head;

        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
        length++;
        return true;
    }

    
    //getter method
    public Node get(int position) {
        Node current = head;

        for (int i = 0; i < position; i++) {
            current = current.next;
        }
        return current;
        }


        //setter method
        public boolean set(int index, int value) {
            Node val = head;

            for (int i = 0; i < index; i++) {
                if (val == null) {
                    return false;
                }
                val = val.next;
            }

            if (val != null) {
                val.value = value;
                return true;
            }
            return false;
        }
        
        //search method
        public Node search(int value) {
            Node current = head;

            while (current != null) {
                if (current.value == value) {
                    return current;
                }
                current = current.next;
            }
            return null;
        }

        //deletion first
        public Node removeFirst() {
            if (head == null) {
                return null;
            }

            Node current = head;
            
            head = current.next;
            current.next = null;
            length--;

            if (head == null) {
                tail = null;
            }
            return current;
        }
        
        //deleteLast
        public Node removeLast() {
            if (head == null) {
                return null;
            }

            Node current = head;
            Node prev = head;

            while (current.next != null) {
                prev = current;
                current = current.next;
            }

            tail = prev;
            prev.next = null;
            length--;

            if (length == 0) {
                tail = null;
                head = null;
            }
            return current;
        }

        //deletion by index
        public Node remove(int position) {
            if (position < 0 || position >= length) {
                return null;
            }

            if (position == 0) {
                return removeFirst();
            } else if (position == length - 1) {
                return removeLast();
            } else {

                Node prev = get(position - 1);
                Node current = prev.next;

                prev.next = current.next;
                current.next = null;

                length--;
                return current;
            }

        }

        //get length
        public int getLength() {
            return length;
        }

        //delete linkedlist itself
        public void deleteList() {
            head = null;
            tail = null;
            length = 0;
        }
        

        


    public static void main(String[] args) {
        try {
            LinkedListExample newList = new LinkedListExample();
            newList.ListNode();
            newList.prepend(10);
            newList.append(30);
            newList.insert(1, 100);
            Node result = newList.get(2);
            System.out.println("Get method called: " + result.value);

           
            System.out.println("Set method called: " + newList.set(3, 10));

            Node searchResult = newList.search(100);
            System.out.println("Search method called: " + searchResult.value);


            // newList.removeFirst();
            // newList.removeLast();
            
            // newList.remove(1);
            newList.deleteList();
            System.out.println("Length: " + newList.getLength());


            newList.printLinkedList();
           

            if (newList.head == null) {
                System.out.println("Head is null");
            } else {
                // System.out.println(newList.head.value);
                // System.out.println(newList.tail.value);
            }

        } catch (NullPointerException e) {
            System.out.println("Null pointer exception");

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

}

// The time complexity of creating a linked list is O(1) because we are just creating a new node and updating a few references. The memory complexity of creating a linked list is also O(1) because we are only using a constant amount of memory to store the new node.
//