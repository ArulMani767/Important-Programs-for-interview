import java.util.*;
public class ReverseanArrayFilterImplementation {
    public static void main(String[] args) {
        String[] arr = {"a","b","a"};
        StringBuilder res = new StringBuilder();
        for(String element : arr) { if(res.indexOf(element)==-1) res.append(element).append(" "); }
        System.out.println(res);
    }
}
