public class Task001 {
  //create custom node class
    static class Node{
        int value;
        Node next;
        //constructor
      Node(int value){
          this.value = value;
          this.next = null;
      }
    }
    public static void main(String[] ags){
        //manually adding elements
        Node first = new Node(100);
        Node second = new Node(200);
        Node third = new Node(300);
        Node fourth = new Node(400);

        //link the nodes together
        first.next = second;
        second.next = third;
        third.next = fourth;

        //Traverse the linked list starting from first
        Node current = first;
        System.out.print("Traversed Node: ");
        while (current != null){
            System.out.print(current.value+" ->");
            current = current.next;
        }
        System.out.println("null");
    }
}
