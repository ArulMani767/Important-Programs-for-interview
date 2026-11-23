package interview;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int[] arr = { 16, 17, 4, 3, 5, 2 };

        // Rightmost element is always a leader
        var max = arr[arr.length - 1];
        System.out.print("Leaders: " + max + " ");

        for (var i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                System.out.print(max + " ");
            }
        }
        System.out.println();
    }
}
