package org.golfshop.entities;

import org.golfshop.Category;


import java.time.LocalDate;
import java.util.UUID;

public class Product {

     String id;
     String name;
     double rating;
     double price;
     Category category;
     final LocalDate createdDate;
     LocalDate lastmodified;


    public Product(String name, double rating, double price, Category category) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.rating = rating;
        this.price = price;
        this.category = category;
        this.createdDate = LocalDate.now();
        this.lastmodified = LocalDate.now();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public LocalDate getLastmodified() {
        return lastmodified;
    }

    public void setLastmodified(LocalDate lastmodified) {
        this.lastmodified = lastmodified;
    }
}


