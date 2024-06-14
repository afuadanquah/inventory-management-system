package org.implementation;

import org.abstact.Product;
import org.concrete.Books;
import org.concrete.Clothing;
import org.interaction.Employee;
import org.interfaces.InventoryService;
import org.model.Person;

import java.util.ArrayList;

public class InventoryServiceImpl implements InventoryService {

  private ArrayList<Product> products = new ArrayList<>();

  //TODO: Is this redundant?
  private Person person;

    public InventoryServiceImpl() {
    }

     public void addProduct(Person person, Product product) {
       if (person instanceof Employee) {
           if (product instanceof Books){
               this.products.add(product);
           } else if (product instanceof Clothing) {
               this.products.add(product);
           } else {
               this.products.add(product);
           }
       } else {
           System.out.println("Access denied as you are a customer");
       }

    }


    public void updateStockLevel(Person person, Product product) {
       if (person instanceof Employee) {
            this.products.add(product);
        }
    }

    public void getProduct() {

        for(Product product1: products) {
            System.out.println(product1.toString());
        }

    }

    //TODO: To get the stock level for each book - be specific for example - James and the Giant Peach
    public void getStockLevels() {

        int bookStockLevels = 0;
        int clothingStockLevels = 0;
        int electronicsStockLevels = 0;

        for(Product product1: products) {
           if(product1.getClass() == Books.class) {
               bookStockLevels++;
           } else if (product1.getClass() == Clothing.class) {
               clothingStockLevels++;
           } else {
               electronicsStockLevels++;
           }
        }

        System.out.println("Current Stock Level for Books: " + bookStockLevels);
        System.out.println("Current Stock Level for Clothing: " + clothingStockLevels);
        System.out.println("Current Stock Level for Electronics: " + electronicsStockLevels);
    }
}
