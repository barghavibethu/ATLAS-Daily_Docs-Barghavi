import java.util.LinkedList;
public class Task001 {
    public static void main(String[] args){
        LinkedList<String> places = new LinkedList<>();
        places.add("Varakala");
        places.add("Spiti valley");
        places.add("Tawang");
        places.add("Mulki");
        System.out.println("First element: "+ places.getFirst());
        System.out.println("Last element: "+ places.getLast());
        places.removeFirst();
        places.removeLast();
        for (String place : places){
            System.out.println(places);
        }
    }
}
