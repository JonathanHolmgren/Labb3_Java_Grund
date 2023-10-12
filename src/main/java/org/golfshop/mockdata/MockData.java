package org.golfshop.mockdata;

import org.golfshop.Category;
import org.golfshop.entities.Product;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.util.ArrayList.*;

public class MockData {

    private static ArrayList<Product> makeMockProducts(){

        ArrayList<Product> productList = new ArrayList<>();

        productList.add(new Product("T200 - Steel",9,9999, Category.IRONS));
        productList.add(new Product("Mavrik 22 - Steel",7,5499, Category.IRONS));
        productList.add(new Product("JPX 921 HM 5-Pw - Steel",8,6999, Category.IRONS));
        productList.add(new Product("M4 21 - steel",3,4699, Category.IRONS));
        productList.add(new Product("Mavrik 22",5,2999, Category.DRIVER));
        productList.add(new Product("SIM2 MAX Ventus BLue",9,3999, Category.DRIVER));
        productList.add(new Product("Stealth 2 HD",7,5299, Category.DRIVER));
        productList.add(new Product("Super Select Newport 2",9,4999, Category.PUTTER));
        productList.add(new Product("Spider Tour Black SS",8,2499, Category.PUTTER));

        return productList;
    }

    public static ArrayList<Product> getProducts(){
        return makeMockProducts();
    }



}
