import java.util.Stack;
public class Task007 {
    public static void main(String[] args) {
        // Create a stack of Strings
        Stack<String> names = new Stack<>();
        // Push elements
        names.push("Bala");
        names.push("Barghavi");
        names.push("Raghava");
        names.push("Sri");

        System.out.println("Stack of names: " + names);
        // Search for an element
        String topElement = names.peek();
        // Display the result
        System.out.println("Top element is: " + topElement);
    }
}
