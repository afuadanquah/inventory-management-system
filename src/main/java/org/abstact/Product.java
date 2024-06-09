package org.abstact;

public abstract class Product {

    private String name;
    private double price;
    private int stockLevel;

    public Product(String name, double price, int stockLevel) {
        this.name = name;
        this.price = price;
        this.stockLevel = stockLevel;
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

    public int getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", stockLevel=" + stockLevel +
                '}';
    }
}
