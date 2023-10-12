package org.golfshop.service;

import org.golfshop.Category;
import org.golfshop.entities.Product;

import java.util.ArrayList;


import static org.golfshop.mockdata.MockData.getProducts;


public class Warehouse {

    private final ArrayList<Product> productList;

    public Warehouse() {
        this.productList = getProducts();
    }

    public void showAll() {

        for (Product p : productList) {
            System.out.println("--------------------");
            System.out.println("ID: " + p.getId());
            System.out.println("Name: " + p.getName());
            System.out.println("Price: " + p.getPrice() + " SEK");
            System.out.println("Rating: " + p.getRating());
            System.out.println("Category: " + p.getCategory());
            System.out.println("CreateDate: " + p.getCreatedDate());
            System.out.println("ModifiedDate: " + p.getLastmodified());
            System.out.println("--------------------");

        }

    }


   // Funderat på om det är bäst att kasta ett felmeddelande eller att skriva ut en text.
    public void createANewProduct(String name, double rating, double price, Category category) {

        if (name.isEmpty()) {
            System.out.println("You have tried to create a product without a name");
        } else if (price < 0) {
            System.out.println("You have tried to create a product with a negative price");
        }
        this.productList.add(new Product(generateNewId(), name, rating, price, category));

    }
 private int generateNewId(){
    return productList.stream()
            .mapToInt(Product::getId)
            .max()
            .orElse(0) + 1;
}



    public static void updateAnExistingProduct() {

    }

    public static void getAllProduct() {

    }

    public static void getProductById() {

    }

    public static void getProductByCategorySortAfterName() {

    }

    public static void getProductAfterDesiredDateDescendingOrder() {

    }

    public static void getProductThatHaveBeenModified() {

    }


}
