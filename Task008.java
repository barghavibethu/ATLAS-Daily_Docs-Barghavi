import java.util.Stack;

public class Task008 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Check if stack is empty before pushing
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Push an element
        stack.push("Hello");
        // Check again after pushing
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
