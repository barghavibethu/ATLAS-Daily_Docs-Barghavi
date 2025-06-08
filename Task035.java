public class Task035 {
    void add(char x, char y) {
        System.out.println("Char values: x = " + x + ", y = " + y);
    }
    void add(int x, int y) {
        System.out.println("Int values: x = " + x + ", y = " + y);
    }
    public static void main(String[] args){
        Task035 obj = new Task035();
        obj.add('d', 'a');
        obj.add(100, 100);
    }
}
