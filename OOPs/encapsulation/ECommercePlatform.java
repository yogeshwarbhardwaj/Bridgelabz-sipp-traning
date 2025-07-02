// Abstract class Product
abstract class Product {
    // Encapsulated fields
    private String productId;
    private String name;
    private double price;

    // Constructor
    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getters and setters
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method to calculate discount
    public abstract double calculateDiscount();

    // Method to get final price after discount
    public double getFinalPrice() {
        return price - calculateDiscount();
    }
}

// Interface Taxable
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Electronics class
class Electronics extends Product implements Taxable {
    private double taxRate; // e.g., 10% tax
    private double discountPercent; // e.g., 5% discount

    public Electronics(String productId, String name, double price, double discountPercent, double taxRate) {
        super(productId, name, price);
        this.discountPercent = discountPercent;
        this.taxRate = taxRate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * (discountPercent / 100);
    }

    @Override
    public double calculateTax() {
        return getFinalPrice() * (taxRate / 100);
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax Rate: " + taxRate + "%";
    }
}

// Clothing class
class Clothing extends Product implements Taxable {
    private double taxRate;
    private double discountPercent;

    public Clothing(String productId, String name, double price, double discountPercent, double taxRate) {
        super(productId, name, price);
        this.discountPercent = discountPercent;
        this.taxRate = taxRate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * (discountPercent / 100);
    }

    @Override
    public double calculateTax() {
        return getFinalPrice() * (taxRate / 100);
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax Rate: " + taxRate + "%";
    }
}

// Groceries class
class Groceries extends Product {
    // Assuming no tax for groceries in this simplified example
    public Groceries(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        // No discount by default, can be extended
        return 0;
    }
}

// Main class to demonstrate
public class ECommercePlatform {
    public static void main(String[] args) {
        // Creating products
        Electronics laptop = new Electronics("E001", "Laptop", 1500.0, 10, 12);
        Clothing tshirt = new Clothing("C001", "T-Shirt", 30.0, 5, 8);
        Groceries rice = new Groceries("G001", "Rice Pack", 20.0);

        // Array of products
        Product[] products = {laptop, tshirt, rice};

        for (Product product : products) {
            System.out.println("Product ID: " + product.getProductId());
            System.out.println("Name: " + product.getName());
            System.out.println("Original Price: $" + product.getPrice());

            if (product instanceof Taxable) {
                Taxable taxProduct = (Taxable) product;
                System.out.println(taxProduct.getTaxDetails());
                System.out.println("Tax: $" + taxProduct.calculateTax());
            } else {
                System.out.println("No tax applicable");
            }

            System.out.println("Discount: $" + product.calculateDiscount());
            System.out.println("Final Price after discount: $" + product.getFinalPrice());
            System.out.println("-----------------------------------");
        }
    }
}