package interview;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListCustomObjects {
    record Student(int id, String name, int percentage) implements Comparable<Student> {

        @Override
        public int compareTo(Student s) {
            // UNCHANGED LOGIC: Sorts the objects in ascending order by ID
            return Integer.compare(this.id, s.id);
        }
    }

    public static void main(String[] args) {
        // Creating an ArrayList of Student objects using modern 'var'
        var listOfStudents = new ArrayList<Student>();

        // Adding students to listOfStudents
        listOfStudents.add(new Student(123, "Student1", 62));
        listOfStudents.add(new Student(231, "Student2", 81));
        listOfStudents.add(new Student(85, "Student3", 79));
        listOfStudents.add(new Student(478, "Student4", 94));
        listOfStudents.add(new Student(365, "Student5", 62));

        System.out.println("listOfStudents Before Sorting :");
        System.out.println(listOfStudents);

        // Sorting the listOfStudents using your natural order logic
        Collections.sort(listOfStudents);

        System.out.println("\nlistOfStudents After Sorting (Ascending by ID) :");
        System.out.println(listOfStudents);
    }
}
