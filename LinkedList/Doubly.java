// class Node {
//     int data;
//     Node prev;
//     Node next;

//     public Node(int data) {
//         this.data = data;
//         this.prev = null;
//         this.next = null;
//     }
// }

// public class Doubly {
    
//     // Forward traverse
//     static void forwardTraverse(Node head) {
//         Node temp = head;

//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }

//     // Backward traverse
//     static void backwardTraverse(Node tail) {
//         Node temp = tail;

//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.prev;
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         Node head = new Node(10);
//         Node second = new Node(20);
//         Node third = new Node(40);

//         head.next = second;
//         second.prev = head;
//         second.next = third;
//         third.prev = second;

//         System.out.println("Forward traversal: ");
//         forwardTraverse(head);

//         System.out.println("Backward traversal: ");
//         backwardTraverse(third);
//     }
// }
