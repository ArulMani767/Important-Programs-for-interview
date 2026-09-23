package interview;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortingWhileIgnoringCase {
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

        // UNCHANGED LOGIC: Sorting the list while ignoring the case differences
        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);

        // list.sort(String.CASE_INSENSITIVE_ORDER); this is also vaild

        System.out.println("ArrayList After Sorting :");
        System.out.println(list);
    }
}
