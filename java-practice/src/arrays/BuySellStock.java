package arrays;

public class BuySellStock {
    public static void main(String[] args) {
        int[] stock = new int[]{310,315,275,295,260,270,290,230,255,250};
        int minSoFar = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;

        for (int i=0; i<stock.length; i++) {
            minSoFar = Math.min(minSoFar, stock[i]);
            maxProfit = Math.max(stock[i]-minSoFar, maxProfit);
        }

        System.out.println(maxProfit);
    }
}
