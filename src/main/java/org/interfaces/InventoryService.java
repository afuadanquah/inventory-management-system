package org.interfaces;

import org.abstact.Product;

public interface InventoryService {

    void addProduct(Product product);
    void updateStockLevel(Product product);

    Product getProduct();

}
