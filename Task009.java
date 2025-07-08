import java.util.LinkedList;

public class Task009 {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        //Add 5 elements
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");
        list1.add("Date");
        list1.add("Orange");
        //Print original list
        System.out.println("List1: " + list1);
        //creating 2nd list
        LinkedList<String> list2 = (LinkedList<String>)list1.clone();
        System.out.println("Cloned list: "+ list2);
    }
}
