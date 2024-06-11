package org.implementation;

import org.abstact.Product;
import org.concrete.Books;
import org.concrete.Clothing;
import org.interaction.Employee;
import org.interfaces.InventoryService;
import org.model.Person;

import java.util.ArrayList;

public class InventoryServiceImpl implements InventoryService {

  private ArrayList<Product> product = new ArrayList<>();

  private Person person;

    public InventoryServiceImpl() {
    }

    public InventoryServiceImpl(Person person) {
        this.person = person;
    }

    public void addProduct(Person person, Product product) {
       if (person instanceof Employee) {
           if (product instanceof Books){
               this.product.add(product);
           } else if (product instanceof Clothing) {
               this.product.add(product);
           } else {
               this.product.add(product);
           }
       } else {
           System.out.println("Access denied as you are a customer");
       }

    }


    public void updateStockLevel(Product product) {
        if(product.getStockLevel() == 3) {
            System.out.println("Adding more stock");
        }
    }

    public void getProduct() {

        for(Product product1: product) {
            System.out.println(product1.toString());
        }

    }
}
