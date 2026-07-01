package com.interview;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SynchronizedHashSetExample {
    public static void main(String[] args) {
        // Creating non-synchronized HashSet object using 'var'
        var set = new HashSet<String>();

        // Adding elements to set
        set.add("JAVA");
        set.add("STRUTS");
        set.add("JSP");
        set.add("SERVLETS");
        set.add("JSF");

        // Getting synchronized set wrapper
        Set<String> synchronizedSet = Collections.synchronizedSet(set);

        // Explicit synchronization block is mandatory during iteration
        synchronized (synchronizedSet) {
            var it = synchronizedSet.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
    }
}
