public class Task013 {
    public static void main(String[] args) {
        int i;
        for (i = 10; i > 0; i--) {
            if (i == 5 || i == 7) {
                continue;
            }
                System.out.println(i);
        }
    }
}
