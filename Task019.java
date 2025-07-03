class OuterClass4 {
    int x = 10;

    static class InnerClass {
        static int y = 5;
    }
}

public class Task019 {
    public static void main(String[] args) {
        OuterClass4.InnerClass myInner = new OuterClass4.InnerClass();
        System.out.println(myInner.y);

    }
}
