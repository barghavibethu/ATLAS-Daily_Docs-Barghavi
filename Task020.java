import javax.lang.model.element.Name;
public class Task020 {
    public static void main(String[] args) {
        char[] name = {'B', 'A', 'R', 'G', 'H', 'A', 'V', 'I'};
        System.out.println(name);
        int n = name.length;
        System.out.println("There are " + n + " letters in my name");
        for (int i = 0; i < n; i++) {
            System.out.println(name[i] + "");
        }
    }
}