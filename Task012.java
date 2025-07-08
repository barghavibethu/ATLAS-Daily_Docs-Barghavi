import java.util.Hashtable;
import java.util.Map;

public class Task012{
    public static void main(String[] args) {
        Hashtable<String, Integer> ht = new Hashtable<>();
        ht.put("Anitha", 101);
        ht.put("Kavitha", 102);
        ht.put("Meera", 103);

        for (Map.Entry<String, Integer> e : ht.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
    }
}
// Map is an interface
// hash table -->   slower , sync , thread safe, no null value accepted
// hash map --> faster while retrieving, asynchro , only one null key and multiple null values.
