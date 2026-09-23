package interview;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("A", "B"));
        System.out.println("Java 21 view: " + list.reversed());
    }
}

