import java.util.Stack;

public class StackMethods {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println("Top element: " + stack.peek());       // C
        System.out.println("Is empty? " + stack.isEmpty());       // false
        System.out.println("Position of B: " + stack.search("B")); // 2
        System.out.println("Stack of names: " + stack);           //[A, B, C]
        System.out.println("Popped: " + stack.pop());             // C
        System.out.println("Stack of names: " + stack);           //[A, B]
        System.out.println("Size: " + stack.size());              // 2
    }
}
