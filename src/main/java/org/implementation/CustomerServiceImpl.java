package org.implementation;

import org.abstact.Product;
import org.interfaces.CustomerService;
import org.model.Person;

import java.util.ArrayList;

public class CustomerServiceImpl implements CustomerService {

    private ArrayList<Product> cart = new ArrayList<>();
    private Person person;

    //TODO: Customer interaction to amend the stock level when they purchase an item
    private InventoryServiceImpl inventory;



    public CustomerServiceImpl(Person person) {
        this.person = person;
    }

    public void getShoppingCart() {
        if (this.cart.isEmpty()) {
            System.out.println("Cart is empty");
            return;
        } else {
            System.out.println("Here is your shopping cart: " + person.toString());
            for(Product product: cart) {
                System.out.println(product.toString());
            }
        }

    }

    public void addToShoppingCart(Product product) {
        this.cart.add(product);
    }

    //TODO: If a customer selects an item, then reduce the stock

}
