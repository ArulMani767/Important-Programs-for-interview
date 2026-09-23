package interview;

import java.util.ArrayList;
import java.util.Comparator;

public class SortArrayListCustomObjectsComparator {
    record Student(int id, String name, int percentage) implements Comparable<Student> {

        @Override
        public int compareTo(Student s) {
            // UNCHANGED LOGIC: Natural sort order remains ascending by ID
            return Integer.compare(this.id, s.id);
        }
    }

    public static void main(String[] args) {
        // Creating an ArrayList using modern 'var' type inference
        var listOfStudents = new ArrayList<Student>();

        // Adding elements to the list
        listOfStudents.add(new Student(123, "Student1", 62));
        listOfStudents.add(new Student(231, "Student2", 81));
        listOfStudents.add(new Student(85, "Student3", 79));
        listOfStudents.add(new Student(478, "Student4", 94));
        listOfStudents.add(new Student(365, "Student5", 62));

        System.out.println("listOfStudents Before Sorting :");
        System.out.println(listOfStudents);

        // MODERN JAVA 21 LOGIC: Sort by percentage directly using a method reference.
        // This replaces the entire "OrderByPercentage" class completely!
        listOfStudents.sort(Comparator.comparingInt(Student::percentage));

        System.out.println("\nlistOfStudents After Sorting by Percentage :");
        System.out.println(listOfStudents);
    }
}
