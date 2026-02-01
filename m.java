import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;

class Product {
    String productId;
    String name;
    double price;
    int quantity;

    Product(String productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

class ShoppingCart {
    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product p) {
        products.add(p);
        System.out.println("Product added: " + p.productId);
    }

    void removeProduct(String productId) {
        for (Product p : products) {
            if (p.productId.equalsIgnoreCase(productId)) {
                products.remove(p);
                System.out.println("Product removed: " + productId);
                return;
            }
        }
        System.out.println("Product not found.");
    }

    void updateQuantity(String productId, int quantity) {
        for (Product p : products) {
            if (p.productId.equalsIgnoreCase(productId)) {
                p.quantity = quantity;
                System.out.println("Product updated: " + productId);
                return;
            }
        }
        System.out.println("Product not found.");
    }

    void viewProducts() {
        System.out.println("\n=== PRODUCTS ===");
        for (Product p : products) {
            System.out.println("ID: " + p.productId + ", Name: " + p.name + ", Price: " + p.price + ", Quantity: " + p.quantity);
        }
    }

    void calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.price * p.quantity;
        }
        System.out.println("Total cost: " + total);
    }
}

public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Update Quantity");
            System.out.println("4. View Products");
            System.out.println("5. Calculate Total");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter product ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter product name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();
                    cart.addProduct(new Product(id, name, price, qty));
                    break;
                case 2:
                    System.out.print("Enter product ID to remove: ");
                    String removeId = sc.nextLine();
                    cart.removeProduct(removeId);
                    break;
                case 3:
                    System.out.print("Enter product ID to update: ");
                    String updateId = sc.nextLine();
                    System.out.print("Enter new quantity: ");
                    int newQty = sc.nextInt();
                    cart.updateQuantity(updateId, newQty);
                    break;
                case 4:
                    cart.viewProducts();
                    break;
                case 5:
                    cart.calculateTotal();
                    break;
                case 6:
                    System.out.println("Thank you for shopping!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
