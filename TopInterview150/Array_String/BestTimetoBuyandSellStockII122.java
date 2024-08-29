package Array_String;

public class BestTimetoBuyandSellStockII122 {
    // sell when the curr is grater than the prev
    // the total profits from the above process recursively
    static int maxProfit(int[] prices) {
        if (prices.length <= 1) return 0;

        int totalProfits = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i-1] < prices[i]) totalProfits += prices[i] - prices[i-1];
        }

        return totalProfits;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
