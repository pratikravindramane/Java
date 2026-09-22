public class BestTimeBuySellStock {
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int buy = prices[0];
        int sum = 0;
        for (int price : prices) {
            if (buy > price) {
                buy = price;
            } else {
                sum = Math.max(sum, price - buy);
            }
        }
        System.out.println(sum);
    }
}
