import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            System.out.println("Enter the array elements (space-separated):");
            var inputLine = sc.nextLine();

            // treat input as an array of elements
            var inputArray = inputLine.split("\\s+");

            // Get all element counts (preserve order)
            var charcount = Arrays.stream(inputArray)
                    .collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()));
            System.out.println("All element counts: " + charcount);

            // Get unique elements (remove duplicates, preserve first occurrence order)
            var unique = Arrays.stream(inputArray)
                    .distinct()
                    .collect(Collectors.joining(" ")); // join with space to show as a single string
            System.out.println("Unique elements (space-separated): " + unique);

            // If you want the unique elements as an array/list instead of a joined string:
            var uniqueList = Arrays.stream(inputArray).distinct().toList();
            System.out.println("Unique elements as list: " + uniqueList);

            // Get only duplicate elements (count > 1)
            var duplicatecount = charcount.entrySet().stream()
                    .filter(entry -> entry.getValue() > 1)
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
            System.out.println("Duplicate elements with counts: " + duplicatecount);
        }
    }

}
