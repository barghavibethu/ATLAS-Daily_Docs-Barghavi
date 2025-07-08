import java.util.*;

public class Task014 {
    public static void main(String[] args) {

        //crate linked list and add elements
        LinkedList<String> list = new LinkedList<>();
        list.add("White");
        list.add("Black");
        list.add("Blue");
        list.add("Red");

        Spliterator<String> splitList1 = list.spliterator();
        Spliterator<String> splitList2 = splitList1.trySplit();

        //print items in both splits
        System.out.println("Items in first half: ");
        if(splitList2 != null){
            splitList2.forEachRemaining(System.out::println);
        }
        System.out.println("Items in second half: ");
        splitList1.forEachRemaining((System.out::println));
    }
}

