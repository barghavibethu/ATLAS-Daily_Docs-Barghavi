import java.util.*;
import java.util.stream.Collectors;

public class Task013{
    public static void main(String[] args){
    List<String> names = Arrays.asList("Abc", "Jkl", "Def", "Mno", "Ghi");
        List<String> sortedNames= names.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Original names: " + names);
        System.out.println("Sorted names: " + sortedNames);

    }
}

