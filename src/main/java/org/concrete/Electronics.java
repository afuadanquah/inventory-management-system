package org.concrete;

import org.abstact.Product;
import org.model.Brand;

public class Electronics extends Product {

    public Brand brand;

    public Electronics(String name, double price, int stockLevel, Brand brand) {
        super(name, price, stockLevel);
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "brand=" + brand +
                "} " + super.toString();
    }
}
