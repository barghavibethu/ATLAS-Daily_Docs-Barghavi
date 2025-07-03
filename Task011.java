import java.util.*;
import java.util.stream.Collectors;

public class Task011 {
    public static void main(String[] args) {
        //creating array list with 5 integers
        List<Integer> numbers = Arrays.asList(2, 3, 4, 4, 2, 4);

        //using stream to calculate tge square of each number
        List<Integer> removeDuplicate =  numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        //printing the square numbers
        System.out.println("Original numbers: " + numbers);
        System.out.println("Duplicate numbers: " + removeDuplicate);
    }
}

