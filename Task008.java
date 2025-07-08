import java.util.LinkedList;
public class Task008 {
    public static void main(String[] args){

        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        list.add("Orange");
        list.add("Mango");

        String[] array = list.toArray(new String[0]);

        //print array element
        System.out.println("Array contents: ");
        for (String item : array){
            System.out.println(item);
        }
    }
}
