package org.entities;


import java.util.Date;

public class Product {

    private int id;
    private String name;
    private double rating;
    private double price;

    private Category category;
    private SubCategory subCategory;
    private final Date createdDate;
    private Date lastmodified;

    public enum Category {
        WOMAN,
        MAN,
        KIDS;
    }
     public enum SubCategory {
        JACKETS,
        HOODIES,
        TSHIRTS,
        SHORTS,
        SHOES,
        JEANS,
        SHIRT,
        DRESSES,
    }
    public Product(Date createdDate) {
        this.createdDate = createdDate;
    }


    public Product(int id, String name, double rating, double price, Category category, SubCategory subCategory, Date createdDate, Date lastmodified) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.price = price;
        this.category = category;
        this.subCategory = subCategory;
        this.createdDate = createdDate;
        this.lastmodified = lastmodified;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public SubCategory getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public Date getLastmodified() {
        return lastmodified;
    }

    public void setLastmodified(Date lastmodified) {
        this.lastmodified = lastmodified;
    }
}


