import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public class Task021{
    public static void main(String[] args) {
        HashMap<String, Integer> Hm1 = new HashMap<String, Integer>();
        Map<String, Integer> syncMap = Collections.synchronizedMap(Hm1);

        syncMap.put("One", 1);
        syncMap.put("Two", 2);

        synchronized (syncMap){
            for(Map.Entry<String, Integer> entry : syncMap.entrySet()){
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
        }
    }
} 
