package org.golfshop;

import org.golfshop.service.Warehouse;



public class Main {


    public static void main(String[] args) {

        Warehouse example = new Warehouse();


       // example.showAll();

        example.createANewProduct("rrr",3,69,Category.DRIVER);
        example.createANewProduct("gdfg",3,69,Category.DRIVER);


        example.showAll();



    }
}
