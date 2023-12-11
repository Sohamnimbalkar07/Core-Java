package Streams;

import java.util.*;

public class Product implements Comparable<Product> {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    
    @Override
    public int compareTo(Product otherProduct) {
        return Double.compare(this.price, otherProduct.price);
    }

    public static void main(String[] args) {
        
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Laptop", 1200.00));
        productList.add(new Product(2, "Smartphone", 800.00));
        productList.add(new Product(3, "Headphones", 150.00));
        productList.add(new Product(4, "Tablet", 500.00));
        productList.add(new Product(5, "Camera", 700.00));
        productList.add(new Product(6, "Printer", 300.00));
        productList.add(new Product(7, "Mouse", 25.00));
        productList.add(new Product(8, "Keyboard", 50.00));
        productList.add(new Product(9, "Monitor", 250.00));
        productList.add(new Product(10, "External Hard Drive", 120.00));
        
        OptionalDouble sum = productList.stream()
        .filter((p) -> p.getPrice() > 500)
        .mapToDouble((p) -> p.getPrice())
        .average();
        
        productList.stream()
        .sorted((p1,p2) -> ((Double)p1.getPrice()).compareTo(p2.getPrice()))                 
        .forEach((p) -> System.out.println(p.getPrice()));
        
        productList.stream()
        .sorted()                 
        .forEach((p) -> System.out.println(p.getPrice()));
        
        System.out.println(sum);

        
    }
}
