public class Factorial{

    // Recursive method to find factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        } else {
            return n * factorial(n - 1); // Recursive call
        }
    }

    public static void main(String[] args) {
        int number = 6; // You can change this number as needed
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
