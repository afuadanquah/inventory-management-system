package org.example;

import org.abstact.Product;
import org.concrete.Books;
import org.concrete.Clothing;
import org.concrete.Electronics;
import org.implementation.InventoryServiceImpl;
import org.interaction.Customer;
import org.interaction.Employee;
import org.interfaces.InventoryService;
import org.model.Author;
import org.model.Brand;
import org.model.Person;

public class Main {
    public static void main(String[] args) {

        Person employee = new Employee("Jane", "Doe");

        Product bookOne = new Books("James and the Giant Peach",5.00, 1,  new Author("Roald", "Dahl"));
        Product bookTwo = new Books("That Peckham Boy",5.00, 4,  new Author("Kenny", "Imafidon"));
        Product clothingOne = new Clothing("Levi Skirt", 10.00, 6, 10);

        InventoryService inventoryService = new InventoryServiceImpl();

        inventoryService.addProduct(employee, bookOne);
        inventoryService.addProduct(employee, bookTwo);
        inventoryService.addProduct(employee, clothingOne);

        //A customer is unable to add stock levels
        Person person = new Customer("Jordan", "James");
        Product electronicsOne = new Electronics("BodyClock", 60.00, 10, new Brand("Lumie", "UK"));
        inventoryService.addProduct(person, electronicsOne);

        inventoryService.getProduct();


    }
}