import java.util.LinkedList;
import java.util.ListIterator;

public class Task010 {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();

        list.add("Bethu");
        list.add("Bala");
        list.add("Barghavi");
        list.add("Raghava");
        list.add("Sri");

        ListIterator<String> listobj = list.listIterator();
        while(listobj.hasNext()){
            System.out.print(listobj.next()+" ");
        }
    }
}
