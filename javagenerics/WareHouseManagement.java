import java.util.*;

// Abstract superclass for all warehouse items
abstract class WarehouseItem {
    private String name;
    private int quantity;

    public WarehouseItem(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public abstract void displayInfo();

    @Override
    public String toString() {
        return "Name: " + name + ", Quantity: " + quantity;
    }
}

// Electronics subclass
class Electronics extends WarehouseItem {
    private String brand;

    public Electronics(String name, int quantity, String brand) {
        super(name, quantity);
        this.brand = brand;
    }

    @Override
    public void displayInfo() {
        System.out.println("Electronics - " + super.toString() + ", Brand: " + brand);
    }
}

// Groceries subclass
class Groceries extends WarehouseItem {
    private String expiryDate;

    public Groceries(String name, int quantity, String expiryDate) {
        super(name, quantity);
        this.expiryDate = expiryDate;
    }

    @Override
    public void displayInfo() {
        System.out.println("Groceries - " + super.toString() + ", Expiry Date: " + expiryDate);
    }
}

// Furniture subclass
class Furniture extends WarehouseItem {
    private String material;

    public Furniture(String name, int quantity, String material) {
        super(name, quantity);
        this.material = material;
    }

    @Override
    public void displayInfo() {
        System.out.println("Furniture - " + super.toString() + ", Material: " + material);
    }
}

// Generic Storage class
class Storage<T extends WarehouseItem> {
    private List<T> items;

    public Storage() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
        System.out.println("Added: " + item);
    }

    public void removeItem(T item) {
        if (items.remove(item)) {
            System.out.println("Removed: " + item);
        } else {
            System.out.println("Item not found.");
        }
    }

    public List<T> getItems() {
        return items;
    }
}

public class WarehouseManagement {
    public static void main(String[] args) {
        // Create storage for different item types
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceryStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        // Add items
        Electronics e1 = new Electronics("Smartphone", 50, "Apple");
        Electronics e2 = new Electronics("Laptop", 20, "Dell");
        Groceries g1 = new Groceries("Apple", 100, "2025-12-31");
        Groceries g2 = new Groceries("Bread", 50, "2025-07-25");
        Furniture f1 = new Furniture("Chair", 30, "Wood");
        Furniture f2 = new Furniture("Table", 10, "Metal");

        electronicsStorage.addItem(e1);
        electronicsStorage.addItem(e2);
        groceryStorage.addItem(g1);
        groceryStorage.addItem(g2);
        furnitureStorage.addItem(f1);
        furnitureStorage.addItem(f2);

        // Display all items regardless of type using a wildcard method
        System.out.println("\nDisplaying all electronics:");
        displayItems(electronicsStorage.getItems());

        System.out.println("\nDisplaying all groceries:");
        displayItems(groceryStorage.getItems());

        System.out.println("\nDisplaying all furniture:");
        displayItems(furnitureStorage.getItems());
    }

    // Wildcard method to display items of any WarehouseItem type
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            item.displayInfo();
        }
    }
}