package kunalkushwaha.queues.basicsPart02;
//p-6
public class LinkedList_implementationOf_CircularQueue {
    // Node class representing each element in the queue
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // CircularQueue class to manage the queue operations
    public static class CircularQueue {
        private Node rear; // Points to the last node in the circular linked list

        public CircularQueue() {
            this.rear = null;
        }

        // Enqueue method to add an element to the queue
        public void enqueue(int data) {
            Node newNode = new Node(data);

            // If the queue is empty, make the new node point to itself and set it as rear
            if (rear == null) {
                rear = newNode;
                rear.next = rear; // Circular link to itself
            } else {
                // Insert the new node after rear and make it the new rear
                newNode.next = rear.next;
                rear.next = newNode;
                rear = newNode;
            }
        }

        // Dequeue method to remove an element from the queue
        public int dequeue() {
            if (rear == null) {
                System.out.println("Queue is empty");
                return -1;
            }

            Node front = rear.next; // Front is the next node of rear

            // If the queue has only one node
            if (rear == front) {
                int data = front.data;
                rear = null; // Queue becomes empty
                return data;
            }

            // Otherwise, move front to the next node and update rear's next pointer
            int data = front.data;
            rear.next = front.next; // Remove the current front node
            return data;
        }

        // Method to check if the queue is empty
        public boolean isEmpty() {
            return rear == null;
        }

        // Method to get the front element without removing it
        public int peek() {
            if (rear == null) {
                System.out.println("Queue is empty");
                return -1;
            }
            return rear.next.data; // Front element is the next node of rear
        }
    }

    // Example usage
    public static class Main {
        public static void main(String[] args) {
            CircularQueue queue = new CircularQueue();

            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);

            System.out.println("Dequeued: " + queue.dequeue()); // Output: 10
            System.out.println("Peek: " + queue.peek());        // Output: 20
            System.out.println("Dequeued: " + queue.dequeue()); // Output: 20

            System.out.println("Is queue empty? " + queue.isEmpty()); // Output: false
        }
    }

}
