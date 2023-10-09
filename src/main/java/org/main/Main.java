package org.main;

import org.entities.Product;

import java.util.List;

import static org.mockdata.MockData.getProducts;

public class Main {
    public static void main(String[] args) {

            List<Product> productsList = getProducts();

            for (Product product: productsList) {
                System.out.print(product.getName() + ": ");
                System.out.println(product.getCategory());
            }

    }
}
