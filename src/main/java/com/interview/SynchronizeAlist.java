package com.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizeAlist {
    public static void main(String[] args) {
        // Creating non-synchronized ArrayList object using 'var'
        var list = new ArrayList<String>();
         
        // Adding elements to list
        list.add("JAVA");
        list.add("STRUTS");
        list.add("JSP");
        list.add("SERVLETS");
        list.add("JSF");
         
        // Getting synchronized list using 'var'
        List<String> synchronizedList = Collections.synchronizedList(list);
         
        // UNCHANGED LOGIC: Explicit synchronization block is mandatory during iteration
        synchronized (synchronizedList) {
            var it = synchronizedList.iterator();
             
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
    }
}
