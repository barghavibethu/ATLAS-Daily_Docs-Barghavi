import java.util.Stack;

public class Task006 {
    public static void main(String[] args) {
        // Create a stack of Strings
        Stack<String> names = new Stack<>();

        // Push elements
        names.push("Bala");
        names.push("Barghavi");
        names.push("Raghava");
        names.push("Sri");

        // Search for an element
        int position = names.search("Barghavi");
        // Display the result
         System.out.println("Element found at position: " + position + " from the top");
        }
    }
