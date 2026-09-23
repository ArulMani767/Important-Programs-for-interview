package interview.collectionprograms;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class SecondLargestSalaryStreamUsingMap {
    record Employee(String name, int salary) {
    }

    public static void main(String[] args) {

        Map<String, Integer> salaries = new LinkedHashMap<>();
        salaries.put("John", 5000);
        salaries.put("Mike", 7000);
        salaries.put("Sam", 6000);
        salaries.put("Tom", 8000);

        var second = salaries.entrySet().stream()
                .map(e -> new Employee(e.getKey(), e.getValue()))
                .distinct()
                .sorted(Comparator.comparingInt(Employee::salary).reversed())
                .skip(1)
                .findFirst();

        System.out.println("Second largest salary: " + second.orElse(null));
    }
}
