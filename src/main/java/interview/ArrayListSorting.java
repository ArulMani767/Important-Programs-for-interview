package interview;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {

    public static void main(String[] args) {
        // Creating an ArrayList of strings using modern 'var'
        var list = new ArrayList<String>();

        // Adding elements to list
        list.add("Virat");
        list.add("rohit");
        list.add("Shikar");
        list.add("ashwin");
        list.add("ravindra");
        list.add("Bhargav");

        System.out.println("ArrayList Before Sorting :");
        System.out.println(list);

        // UNCHANGED LOGIC: Standard natural ASCII/lexicographical sorting
        Collections.sort(list);

        System.out.println("ArrayList After Sorting :");
        System.out.println(list);
    }

}
