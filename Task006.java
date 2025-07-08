import java.util.LinkedList;
public class Task006 {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        //Add 5 elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Orange");
        //Print original list
        System.out.println("Original list: "+ list);
        //Replace 3rd element(index 2)
        list.remove(3);
        //Print updated list
        System.out.println("After replacement: "+list);
    }
}
