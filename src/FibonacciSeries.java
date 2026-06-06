public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0, b = 1, n = 5;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
