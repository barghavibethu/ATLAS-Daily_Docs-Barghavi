import java.util.Stack;

public class Task005 {
    public static void main(String[] args) {
        // Create a stack
        Stack<String> name = new Stack<>();

        // Push elements
        name.push("Bethu");
        name.push("Bala");
        name.push("Barghavi");

        System.out.println("Before deletion ");
        System.out.println("Stack of names: " + name);

        // Pop the top element
        String popped = name.pop();
        // Print popped element
        System.out.println("Popped element: " + popped);

        // Print remaining stack
        System.out.println("Stack after pop: " + name);
    }
}
