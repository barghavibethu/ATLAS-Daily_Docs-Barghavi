//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Task007 {
    public static void main(String[] args) {
        try {
            int[] a = new int[2];
            int b = 0;
            int c = 1 / b;
            System.out.println("Access element three :" + a[3]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown  :" + String.valueOf(e));
        }

        System.out.println("Out of the block");
    }
}
