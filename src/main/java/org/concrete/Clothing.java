package org.concrete;

import org.abstact.Product;

public class Clothing extends Product {

    private int size;

    public Clothing(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "size=" + size +
                "} " + super.toString();
    }
}
