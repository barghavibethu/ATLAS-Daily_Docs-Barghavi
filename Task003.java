//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

class Task003 {
    public static void main(String[] args) {
        int n = 10;
        int m = 0;

        try {
            int ans = n / m;
            System.out.println("Answer: " + ans);
        } catch (ArithmeticException var7) {
            System.out.println("Error: Division by zero is not allowed!");
        } finally {
            System.out.println("Program continues after handling the exception.");
        }

    }
}
