public class Task008 {
    public static void main(String[] args){
        String str = "Barghavi";
        String reversed = "";
        for (int i = str.length() -1; i >= 0; i--){
            reversed += str.charAt(i);
        }
        System.out.println("Reversed string: "+ reversed);
    }
}
