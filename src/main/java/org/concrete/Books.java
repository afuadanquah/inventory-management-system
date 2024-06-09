package org.concrete;

import org.abstact.Product;
import org.model.Author;

public class Books extends Product {

    public Author author;

    public Books(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Books{" +
                "author=" + author +
                "} " + super.toString();
    }
}
