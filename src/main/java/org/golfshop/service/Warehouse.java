package org.golfshop.service;

import org.golfshop.Category;
import org.golfshop.entities.ImmutableObjectProduct;
import org.golfshop.entities.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


import static org.golfshop.mockdata.MockData.getProducts;


public class Warehouse {

    private final ArrayList<Product> productList;

    public Warehouse() {
        this.productList = getProducts();
    }

    private ImmutableObjectProduct createImmutableObject(Product product) {
        return new ImmutableObjectProduct(product.getId(),
                product.getName(),
                product.getPrice(),
                product.getRating(),
                product.getCategory(),
                product.getCreatedDate(),
                product.getLastmodified()
        );
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

    private int generateNewId() {
        return productList.stream()
                .mapToInt(Product::getId)
                .max()
                .orElse(0) + 1;
    }

    public void updateAnExistingProduct(int id, String name, double rating, Category category) {

        if (!name.isEmpty()) {
            for (Product p : productList) {
                if (p.getId() == id) {
                    p.setName(name);
                    p.setRating(rating);
                    p.setCategory(category);
                    p.setLastmodified(LocalDate.now());
                }
            }
        }
        System.out.println("You have tried to update a product without a name");
    }
    public List<ImmutableObjectProduct> getAllProduct() {
        return productList.stream()
                .map(this::createImmutableObject)
                .toList();
    }
    public List<ImmutableObjectProduct> getProductById(int id) {
        return productList.stream()
                .filter(product -> product.getId() == id)
                .map(this::createImmutableObject)
                .toList();
    }
    public List<ImmutableObjectProduct> getProductByCategorySortAfterName(Category category) {
        return productList.stream()
                .filter(product -> product.getCategory().equals(category))
                .sorted(Comparator.comparing(Product::getName))
                .map(this::createImmutableObject)
                .toList();
    }
    public List<ImmutableObjectProduct> getProductAfterDesiredDateDescendingOrder(LocalDate date) {
        return productList.stream()
                .filter(product -> product.getCreatedDate().isAfter(date))
                .sorted(Comparator.comparing(Product::getCreatedDate))
                .map(this::createImmutableObject)
                .toList();
    }
    public List<ImmutableObjectProduct> getProductThatHaveBeenModified() {
        return productList.stream()
                .filter(product -> !product.getCreatedDate().isEqual(product.getLastmodified()))
                .map(this::createImmutableObject)
                .toList();
    }
}


