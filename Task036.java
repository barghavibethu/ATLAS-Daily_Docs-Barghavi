public class Task036 {
    void add(int x, float y) {
        System.out.println("Values: Int x = " + x + ", float y = " + y);
    }
    void add(float x, int y) {
        System.out.println("Values: Float x = " + x +", Int y = " + y);
    }

    public static void main(String[] args) {
        Task036 obj = new Task036();
        obj.add(10.50f, 60);
        obj.add(100, 80.80f);
    }
}
