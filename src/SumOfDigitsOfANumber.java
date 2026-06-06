import java.util.*;
public class SumOfDigitsOfANumber {
    public static void main(String[] args) {
        int sum=0, digit,n;
        Scanner sc= new Scanner(System.in);
        n=  sc.nextInt();
        while(n>0){
            digit=n%10;
            sum=sum+digit;
            n=n/10;
        }
        System.out.println(sum);
    }
}
