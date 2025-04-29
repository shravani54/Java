// EcommerceSystem.java

import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;
    private String productId;

    public Product(String name, double price, String productId) {
        this.name = name;
        this.price = price;
        this.productId = productId;
    }

    public void displayProductDetails() {
        System.out.println("Product ID: " + this.productId + ", Name: " + this.name + ", Price: $" + this.price);
    }

    public double getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }
}

class Customer {
    private String name;
    private String customerId;

    public Customer(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    public void displayCustomerDetails() {
        System.out.println("Customer ID: " + this.customerId + ", Name: " + this.name);
    }

    public String getName() {
        return this.name;
    }
}

class Order {
    private Customer customer;
    private List<Product> products;

    public Order(Customer customer) {
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
        System.out.println("Added " + product.getName() + " to the order.");
    }

    public double calculateTotalCost() {
        double totalCost = 0.0;
        for (Product product : this.products) {
            totalCost += product.getPrice();
        }
        return totalCost;
    }

    public void displayOrderDetails() {
        System.out.println("Order Details for " + this.customer.getName() + ":");
        for (Product product : this.products) {
            product.displayProductDetails();
        }
        System.out.println("Total Order Cost: " + this.calculateTotalCost());
    }
}

public class EcommerceSystem {
    public static void main(String[] args) {
        // Create some products
        Product product1 = new Product("Laptop", 999.99, "P001");
        Product product2 = new Product("Smartphone", 599.99, "P002");
        Product product3 = new Product("Headphones", 89.99, "P003");

        // Create a customer
        Customer customer = new Customer("Alice Smith", "C001");

        // Create an order for the customer
        Order order = new Order(customer);

        // Add products to the order
        order.addProduct(product1);
        order.addProduct(product2);
        order.addProduct(product3);

        // Display the order details
        order.displayOrderDetails();
    }
}
