import java.util.Arrays;
public class ValidateIfTheGivenArraysAreEqual {
    static void arrayEquals(String[] arr1, String[]arr2){
        if(Arrays.equals(arr1, arr2)){ System.out.println("given arrays are equal"); }
        else{ System.out.println("given arrays are not equal"); }
    }
}
