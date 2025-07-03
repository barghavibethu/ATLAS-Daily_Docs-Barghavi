//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;

class Task012 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList();
        al.add("Barghavi");
        al.add("Bethu");
        System.out.println("Orignal List : " + String.valueOf(al));
        al.add(1, "Hello");
        System.out.println("After Adding element at index 1 : " + String.valueOf(al));
        al.remove(0);
        System.out.println("Element removed from index 0 : " + String.valueOf(al));
        al.remove("Barghavi");
        System.out.println("Element Barghavi removed : " + String.valueOf(al));
        al.set(0, "B");
        System.out.println("List after updation of value : " + String.valueOf(al));
    }
}
