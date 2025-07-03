//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Task008 {
    public static void main(String[] args) {
        try {
            int[] a = new int[2];

            try {
                int b = 0;
                int var3 = 1 / b;
            } catch (Exception e) {
                System.out.println("Exception thrown: " + String.valueOf(e));
            }

            System.out.println("Access element three :" + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown: " + String.valueOf(e));
        }

        System.out.println("Out of the block");
    }
}
