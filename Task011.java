public class Task011 {
    // Node class for each element
    class Node {
        int data;
        Node next;
    }

    Node front = null;
    Node rear = null;

    // Add element to rear of queue
    void enqueue(int value) {
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = null;

        if (front == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println(value + " added to the queue.");
        printStatus();
    }

    // Remove element from front of queue
    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot remove.");
            return;
        }

        System.out.println(front.data + " removed from the queue.");
        front = front.next;

        if (front == null) {
            rear = null;
        }

        printStatus();
    }

    // Peek at the front element
    void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front element is: " + front.data);
        }
    }

    // Display all elements in queue
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue: ");
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Check if queue is empty
    boolean isEmpty() {
        return front == null;
    }

    // Dummy isFull method for learning (linked list never full)
    boolean isFull() {
        return false;
    }

    // Print queue status
    void printStatus() {
        System.out.println("Is queue empty? " + isEmpty());
        System.out.println("Is queue full? " + isFull());
    }

    // Main method
    public static void main(String[] args) {
        Task011 q = new Task011();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();
        q.peek();

        q.dequeue();
        q.display();

        q.dequeue();
        q.dequeue();
        q.dequeue();  // Try to remove from empty queue
    }
}
