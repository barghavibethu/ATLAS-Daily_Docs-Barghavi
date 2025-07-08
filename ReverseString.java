public class ReverseString {

    // Recursive method to reverse a string
    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str; // Base case: empty string
        }
        // Recursive case: reverse the substring after the first character and append the first character
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String input = "hello";  // You can change the string here
        String reversed = reverse(input);
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversed);
    }
}
