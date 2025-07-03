import java.util.*;
import java.util.stream.Collectors;

public class Task007 {
    public static void main(String[] args) {
        //creating array list with 5 integers
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6);

        //using stream to calculate tge square of each number
        List<Integer> squareOfNums = numbers.stream().map(num -> num * num).collect(Collectors.toList());

        //printing the square numbers
        System.out.println("Original numbers: " + numbers);
        System.out.println("Squares of the numbers: " + squareOfNums);
    }
}
