package org.concrete;

import org.abstact.Product;

public class Clothing extends Product {

    private int size;

    public Clothing(String name, double price, int stockLevel, int size) {
        super(name, price, stockLevel);
        this.size = size;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "size=" + size +
                "} " + super.toString();
    }
}
