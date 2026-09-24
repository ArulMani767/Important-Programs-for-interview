package interview.collectionprograms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SecondLargestSalaryUsingListIndex {
    record Employee(String name, int salary) {
    }

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 5000));
        employees.add(new Employee("Mike", 7000));
        employees.add(new Employee("Sam", 6000));
        employees.add(new Employee("Tom", 8000));

        employees.sort(Comparator.comparingInt(Employee::salary).reversed());

        var second = employees.size() > 1 ? employees.get(1) : null;

        System.out.println("Second largest salary: " + second);
    }
}
