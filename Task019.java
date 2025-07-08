import java.util.HashMap;
public class Task019 {
    public static void main(String[] args){
        HashMap<String, String> map = new HashMap<>();
        map.put(null, "First null value");
        map.put(null, "Updated Null Value");

        map.put("A", "Barghavi");
        map.put("B", "Bethu");

        for (String key : map.keySet()){
            System.out.println(("Key: " + key + ", Value: " + map.get(key)));
        }
    }
}