//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

class Task009 {
    static void fun() throws IllegalAccessException {
        System.out.println("Inside fun(). ");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) {
        try {
            fun();
        } catch (IllegalAccessException var2) {
            System.out.println("Caught in main.");
        }

    }
}
