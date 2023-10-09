package org.main;

import org.entities.Product;
import org.service.Warehouse;

import java.util.List;

import static org.mockdata.MockData.getProducts;
import static org.service.Warehouse.createANewProduct;


public class Main {
    public static void main(String[] args) {

      List<Product>  productsList = Warehouse.getProductList();

            for (Product product: productsList) {
                System.out.print(product.getName() + ": ");
                System.out.println(product.getCategory());
            }
        createANewProduct();
    }

}
