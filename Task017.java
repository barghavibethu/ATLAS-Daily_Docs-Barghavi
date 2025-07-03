class OuterClass2 {
    int x = 10;
    static class InnerClass {
        int y = 5;
    }
}

public class Task017 {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}

