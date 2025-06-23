public class Item {
    // Attributes of the Item class
    String itemCode;
    String itemName;
    double price;

    // Constructor to initialize the item
    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: $" + price);
    }

    // Method to calculate total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        // Create an Item object
        Item item1 = new Item("A101", "Wireless Mouse", 25.50);

        // Display item details
        item1.displayItemDetails();

        // Calculate total cost for a quantity, e.g., 3 units
        int quantity = 3;
        double totalCost = item1.calculateTotalCost(quantity);
        System.out.println("Total cost for " + quantity + " items: $" + totalCost);
    }
}