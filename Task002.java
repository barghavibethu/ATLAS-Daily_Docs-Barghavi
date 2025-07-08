class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}
class CustomLinkedList<T> {
    private Node<T> head;
    private int size = 0;

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public T removeFirst() {
        if (head == null) {
            throw new
                    java.util.NoSuchElementException("List is empty");
        }
        T removedData = head.data;
        head = head.next;
        size--;
        return removedData;
    }

    public T get(int index) {
        checkBounds(index);
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public int size() {
        return size;
    }

    private void checkBounds(int index) {
        if (index < 0 || index >= size) {
            throw new
                    IndexOutOfBoundsException("Index out of bounds");
        }
    }
}

class Task002 {
    public static void main(String[] args) {
        CustomLinkedList<String> liobj = new CustomLinkedList<>();
        liobj.add("Anitha");
        liobj.add("Verma");
        liobj.addFirst("Jack");

        System.out.println("First Element: " + liobj.get(0));
        System.out.println("Size: " + liobj.size());

        liobj .removeFirst();

        System.out.println("First Element after removal: " + liobj.get(0));
        System.out.println("Size after removal: " + liobj.size());
    }
}
