class Node {
        int data;
        Node next;

        //constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public class Task003{
        public static void main(String[] args){
            Node head = null;
            Node tail = null;

            //Adding elements
            int[] values = {10, 20, 30, 40, 50};
            for (int val : values) {
                Node newNode = new Node(val);
                if(head == null){
                head = newNode;
                tail = newNode;
                newNode.next = head;
            } else {
                tail.next = newNode;
                tail = newNode;
                tail.next = head;
            }
        }
        if(head != null){
            Node current = head;
            do {
                System.out.print(current.data+" ");
                current = current.next;
            } while (current != head);
        }
    }
}
