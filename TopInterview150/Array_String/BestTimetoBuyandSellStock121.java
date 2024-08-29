package Array_String;

public class BestTimetoBuyandSellStock121 {
    static int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE; int sell = 0;
        for (int i = 0; i < prices.length; i++) {
            buy = Math.min(buy, prices[i]);
            sell = Math.max(sell, prices[i] - buy);
        }
        return sell;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
    }
}
