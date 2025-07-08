public class Task007 {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5, 6};
        int n = array.length;
        for (int i = 0; i < n/2; i++) {
            int temp = array[i];
            array[i] = array[n-1-i];
            array[n-1-i] = temp;
        }
        System.out.println("Reversed array: ");
        for (int num : array) {
         System.out.println(num+"");
        }
    }
}
