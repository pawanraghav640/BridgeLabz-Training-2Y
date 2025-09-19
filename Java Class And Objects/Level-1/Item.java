import java.util.Scanner;

public class Item {
    String itemCode;
    String itemName;
    double price;

    // Constructor to initialize Item object
    Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    // Method to calculate total cost for given quantity
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter item code: ");
        String itemCode = scanner.nextLine();

        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        Item item = new Item(itemCode, itemName, price);
        item.displayDetails();
        System.out.println("Total Cost for " + quantity + " items: " + item.calculateTotalCost(quantity));

        scanner.close();
    }
}
