import java.util.*;
public class P36_EqualityOfTwoArrays {
    public static void main(String[] args) {
        int[] a1={1,2,3}, a2={1,2,3};
        boolean equal = true;
        for(int i=0; i<a1.length; i++){ if(a1[i]!=a2[i]){ equal=false; break; } }
        System.out.println(equal);
    }
}
