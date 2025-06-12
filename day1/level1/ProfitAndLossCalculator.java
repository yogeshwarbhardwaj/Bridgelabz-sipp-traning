public class ProfitAndLossCalculator {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;

        int profit = sellingPrice - costPrice;
        double profitPercentage = (double) profit / costPrice * 100;

        System.out.println(
            "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice +
            "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage + "%"
        );
    }
}