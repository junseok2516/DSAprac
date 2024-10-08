import java.util.Arrays;

public class practice {
    // O
    static int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE; int sell = 0;
        for (int i = 0; i < prices.length; i++) {
            buy = Math.min(buy, prices[i]);
            System.out.printf("Buy:%d\n", buy);
            sell = Math.max(sell, prices[i]-buy);
            System.out.printf("Sell:%d\n", sell);
        }
        return sell;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
}