import java.util.LinkedList;
import java.util.Spliterator;

public class Task013{
    public static void main(String[] args) {
        LinkedList<String> lobj = new LinkedList<>();

        lobj.add("Bala");
        lobj.add("Barghavi");
        lobj.add("Bethu");

        Spliterator<String> sitobj = lobj.spliterator();

        System.out.println("Splitting the list:");
        sitobj.forEachRemaining(System.out::println);
    }
}

