package org.implementation;

import org.abstact.Product;
import org.interfaces.InventoryService;

public class InventoryServiceImpl implements InventoryService {

  private Product product;

    public InventoryServiceImpl() {
    }

    public InventoryServiceImpl(Product product) {
        this.product = product;
    }

    public void addProduct(Product product) {
        if (this.product == product) {
            System.out.println("Product has been added");
        }
    }


    public void updateStockLevel(Product product) {
        if(product.getStockLevel() == 0) {
            System.out.println("Adding more stock");
        }
    }

    public Product getProduct() {
        return this.product;
    }
}
