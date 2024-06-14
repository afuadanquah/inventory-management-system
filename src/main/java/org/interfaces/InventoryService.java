package org.interfaces;

import org.abstact.Product;
import org.model.Person;

public interface InventoryService {

    void addProduct(Person person, Product product);
    void updateStockLevel(Person person, Product product);

    void getProduct();

    void getStockLevels();

}
