package org.mockdata;

import org.entities.Product;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MockData {

    private static List<Product> makeMockProducts(){

        return List.of(

                new Product(1,"BASIC HEAVY WEIGHT T-SHIRT",0,17.99,Product.Category.MAN,Product.SubCategory.TSHIRTS,new Date(),new Date()),
                new Product(2,"HEAVY-WEIGHT T-SHIRT",0,25.99,Product.Category.MAN, Product.SubCategory.TSHIRTS,new Date(),new Date()),
                new Product(3,"BASIC SLIM FIT T-SHIRT",0,12.99 ,Product.Category.MAN, Product.SubCategory.TSHIRTS,new Date(),new Date()),
                new Product(4,"2-IN-1 TRAINING SHORTS",0,29.99,Product.Category.MAN, Product.SubCategory.SHORTS,new Date(),new Date()),
                new Product(5,"COMFORT BERMUDA SHORTS",0,25.99,Product.Category.MAN, Product.SubCategory.SHORTS,new Date(),new Date()),
                new Product(6,"100% LINEN BERMUDA SHORTS",0,35.99,Product.Category.MAN, Product.SubCategory.SHORTS,new Date(),new Date()),
                new Product(7,"HOODIE",0,32.99,Product.Category.MAN,Product.SubCategory.HOODIES,new Date(),new Date()),
                new Product(8,"SWEATSHIRT WITH ZIP COLLAR",0,29.99,Product.Category.MAN, Product.SubCategory.SHIRT,new Date(),new Date()),
                new Product(9,"SWEATSHIRT WITH ZIP COLLAR AND SLOGANS",0,45.99,Product.Category.MAN, Product.SubCategory.SHIRT,new Date(),new Date()),
                new Product(10,"POLO SWEATSHIRT",0,29.99,Product.Category.MAN, Product.SubCategory.SHIRT,new Date(),new Date()),
                new Product(11,"ZIP-UP HOODIE",0,32.99,Product.Category.MAN, Product.SubCategory.HOODIES,new Date(),new Date()),
                new Product(12,"HOODED PUFFER JACKET",0,69.99,Product.Category.MAN, Product.SubCategory.JACKETS,new Date(),new Date()),
                new Product(13,"HOODED TECHNICAL JACKET",0,69.99,Product.Category.MAN, Product.SubCategory.JACKETS,new Date(),new Date()),
                new Product(14,"RIBBED TOP",0,9.99,Product.Category.WOMAN, Product.SubCategory.TSHIRTS,new Date(),new Date()),
                new Product(15,"CROPPED POLYAMIDE T-SHIRT",0,12.99,Product.Category.WOMAN, Product.SubCategory.TSHIRTS,new Date(),new Date()),
                new Product(16,"WOOL TROUSERS WITH SATIN HEMS - LIMITED EDITION",0,109.00,Product.Category.WOMAN, Product.SubCategory.JEANS,new Date(),new Date()),
                new Product(17,"VOLUMINOUS TAFFETA SKIRT - LIMITED EDITION",0,109.00,Product.Category.WOMAN, Product.SubCategory.DRESSES,new Date(),new Date()),
                new Product(18,"MIDI SKIRT WITH KNOT - LIMITED EDITION",0,89.99, Product.Category.WOMAN, Product.SubCategory.DRESSES,new Date(),new Date()));
    }

    public static List<Product> getProducts(){
        return makeMockProducts();
    }



}
