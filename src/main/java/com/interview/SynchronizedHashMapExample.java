package com.interview;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedHashMapExample {
    public static void main(String[] args) {
        // Creating non-synchronized HashMap object using 'var'
        var map = new HashMap<String, String>();

        // Adding key-value elements to map
        map.put("Language", "JAVA");
        map.put("Framework", "STRUTS");
        map.put("View", "JSP");
        map.put("Controller", "SERVLETS");
        map.put("UI", "JSF");

        // Getting synchronized map wrapper
        Map<String, String> synchronizedMap = Collections.synchronizedMap(map);

        // Explicit synchronization block on the map instance is mandatory during
        // iteration
        synchronized (synchronizedMap) {
            var entrySet = synchronizedMap.entrySet();
            var it = entrySet.iterator();

            while (it.hasNext()) {
                var entry = it.next();
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
