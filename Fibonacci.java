public class Fibonacci {

    // Recursive method to find nth Fibonacci number
    public static int fibonacci(int n) {
        if (n == 0) return 0;           // Base case
        else if (n == 1) return 1;      // Base case
        else return fibonacci(n - 1) + fibonacci(n - 2);  // Recursive call
    }

    public static void main(String[] args) {
        int count = 10;  // Number of terms in the series (you can change this)

        System.out.println("Fibonacci series up to " + count + " terms:");
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
