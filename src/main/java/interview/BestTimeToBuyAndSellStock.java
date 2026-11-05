package interview;

public class BestTimeToBuyAndSellStock {
    // important interview question they will ask question like Best time to buy and
    // sell stock
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };

        var minPrice = Integer.MAX_VALUE;
        var maxProfit = 0;

        for (var price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }

        System.out.println("Max Profit: " + maxProfit); // 5
    }
}
