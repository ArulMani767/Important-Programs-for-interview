import java.util.stream.*;
import java.util.*;

public class RemoveDuplicatesFoundInStringPrintWithoutDuplicatesAndCountJava8 {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter the string:");
            var input = sc.nextLine();
            
            // Get all character counts
            var charcount = input.chars().mapToObj(c -> (char) c)
                    .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
            System.out.println("All character counts: " + charcount);
            
            // Get unique characters (remove duplicates)
            var unique = input.chars().mapToObj(c -> String.valueOf((char) c)).distinct().collect(Collectors.joining());
            System.out.println("Unique characters: " + unique);
            
            // Get only duplicate characters (count > 1)
            var duplicatecount = charcount.entrySet().stream().filter(entry -> entry.getValue() > 1)
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
            System.out.println("Duplicate characters: " + duplicatecount);
        }
    }
}
