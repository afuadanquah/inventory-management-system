package org.example;

import org.abstact.Product;
import org.concrete.Books;
import org.implementation.InventoryServiceImpl;
import org.interaction.Employee;
import org.interfaces.InventoryService;
import org.model.Author;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Jane", "Doe");

        Product product = new Books(new Author("Jack", "Smith"));

        InventoryService inventoryService = new InventoryServiceImpl(product);

        inventoryService.addProduct(product);

        inventoryService.getProduct();
    }
}