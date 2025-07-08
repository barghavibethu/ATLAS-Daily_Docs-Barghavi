// Node class for Doubly Linked List
class DoublyNode {
    int data;
    DoublyNode prev;
    DoublyNode next;

    DoublyNode(int data) {
        this.data = data;
        prev = null;
        next = null;
    }
}

// Doubly Linked List class
class DoublyLinkedList {
    DoublyNode head;

    // Insert node at end
    public void insertEnd(int data) {
        DoublyNode newNode = new DoublyNode(data);

        if (head == null) {
            head = newNode;
            return;
        }

        DoublyNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Display list forward
    public void displayForward() {
        DoublyNode temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Display list backward
    public void displayBackward() {
        if (head == null) return;

        DoublyNode temp = head;
        // Go to last node
        while (temp.next != null) {
            temp = temp.next;
        }

        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }
}

// Main class
public class Task018 {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);

        list.displayForward();
        list.displayBackward();
    }
}
