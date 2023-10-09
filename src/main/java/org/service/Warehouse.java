package org.service;

import org.entities.Product;

import java.util.Date;
import java.util.List;

import static org.mockdata.MockData.getProducts;

public class Warehouse {



    public static void createANewProduct(String name, double rating, double price, Product.Category category, Product.SubCategory subCategory){

        Date createdDate = new Date();
        Date lastmodified = new Date();
        String idd;


        Product newProduct = new Product(1,"BASIC HEAVY WEIGHT T-SHIRT",3,17.99,Product.Category.MAN,Product.SubCategory.TSHIRTS,createdDate,lastmodified);

        //Gör kod så den kollar högst Id i listan och sen plusar på ett och sparar ner det som nytt id.
        // Set till att name fältet inte får vara tomt
        // Priset måste vara ett positivt tal
        // Rating ska vara en siffra mellan 1-5


    }


    public static void updateAnExistingProduct(){

    }
    public static void getAllProduct(){

    }
    public static void getProductById(){

    }
    public static void getProductByCategorySortAfterName(){

    }
    public static void getProductAfterDesiredDateDescendingOrder(){

    }
    public static void getProductThatHaveBeenModified(){

    }





}
