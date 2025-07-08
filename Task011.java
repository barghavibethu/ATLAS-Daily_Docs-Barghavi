import java.util.LinkedList;
public class Task011 {
    public static void main(String[] args){
        //Create a linkedlist
        LinkedList<String> list = new LinkedList<>();

        //Use push to add elements
        list.push("White");
        list.push("Blue");
        list.push("Red");
        list.push("Black");
        list.push("Green");
        //printing list after pushing
        System.out.println("After push: "+ list);

        //use pop90 to remove the top element
        String removed = list.pop();
        System.out.println("Popped element: "+ removed);

        //print the list after popping
        System.out.println("After popping: " +list);
    }
}
