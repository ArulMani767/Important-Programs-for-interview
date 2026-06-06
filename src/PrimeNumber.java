import java.util.*;
import java.util.stream.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int input=sc.nextInt();
        for(int i=2;i<=input/2;i++){
            if(input%i==0){ System.out.println(input +" not a prime number"); }
            else{ System.out.println(input +"  a prime number"); }
        }
        sc.close();
    }
}
