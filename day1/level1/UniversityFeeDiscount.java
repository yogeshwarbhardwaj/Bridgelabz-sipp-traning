public class UniversityFeeDiscount {
    public static void main(String[] args) {
        double fee = 125000;
        double discountPercent = 10;

        double discount = (discountPercent / 100) * fee;
        double discountedFee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and the final discounted fee is INR " + discountedFee);
    }
}