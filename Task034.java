public class Task034 {
    void add(int x, int y) {
        System.out.println("Two parameters: x = " + x + ", y = " + y);
    }
    void add(int x, int y, int z){
        System.out.println("Three parameters: x = " + x + ", y = " + y + ", z = " + z);
    }
    public static void main(String[] args) {
        Task034 obj = new Task034();
        obj.add(10, 20);
        obj.add(30, 50, 100);
    }
}
