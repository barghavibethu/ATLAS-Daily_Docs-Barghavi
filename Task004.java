public class Task004 {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int divide(int a, int b) {
        return a / b;
    }
    public static void main(String[] args){
        int x = 5;
        int y = 7;
        System.out.println("Main Started");
        System.out.println("Sum of 2 numbers is: " + add(x, y));
        System.out.println("Difference of 2 numbers is: " + subtract(x, y));
        System.out.println("Product of 2 numbers is: "+ multiply(x, y));
        System.out.println("Division of 2 numbers is: "+ divide(x, y));
        System.out.println("Main Ended");
    }
}
