package org.concrete;

import org.abstact.Product;
import org.model.Brand;

public class Electronics extends Product {

    public Brand brand;

    public Electronics(Brand brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "brand=" + brand +
                "} " + super.toString();
    }
}
