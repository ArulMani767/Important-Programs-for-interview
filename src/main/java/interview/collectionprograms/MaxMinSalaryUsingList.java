package interview.collectionprograms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaxMinSalaryUsingList {
    record Employee(String name, int salary) {
    }

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 5000));
        employees.add(new Employee("Mike", 7000));
        employees.add(new Employee("Sam", 6000));
        employees.add(new Employee("Tom", 8000));

        // Max: single pass, track the highest seen so far
        var max = employees.get(0);
        for (var emp : employees) {
            if (emp.salary() > max.salary()) {
                max = emp;
            }
        }

        // Min: single pass, track the lowest seen so far
        var min = employees.get(0);
        for (var emp : employees) {
            if (emp.salary() < min.salary()) {
                min = emp;
            }
        }

        System.out.println("Max salary: " + max);
        System.out.println("Min salary: " + min);

        // var max =
        // employees.stream().max(Comparator.comparingInt(Employee::salary)).orElse(null);
        // var min =
        // employees.stream().min(Comparator.comparingInt(Employee::salary)).orElse(null);
    }
}
