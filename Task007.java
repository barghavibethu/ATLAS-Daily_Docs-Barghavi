import java.util.LinkedList;

public class Task007 {
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
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        for(String str: list){
            System.out.print(str+ " ");
        }
    }
}
