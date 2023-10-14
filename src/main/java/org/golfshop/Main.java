package org.golfshop;

import org.golfshop.entities.ImmutableObjectProduct;
import org.golfshop.service.Warehouse;

import java.time.LocalDate;
import java.util.List;


public class Main {


    public static void main(String[] args) {

        Warehouse example = new Warehouse();
        example.addMockDateToWarehouse();


        // example.showAll();


        // getAllProduct()
        List<ImmutableObjectProduct> exp = example.getAllProduct();
        exp.forEach(System.out::println);


        // getProductById()
        List<ImmutableObjectProduct> exp1 = example.getProductById(8);
            exp1.forEach(System.out::println);

        //     getProductByCategorySortAfterName()
        List<ImmutableObjectProduct> exp2 = example.getProductByCategorySortAfterName(Category.PUTTER);
            exp2.forEach(System.out::println);

        //    getProductAfterDesiredDateDescendingOrder()
        List<ImmutableObjectProduct> exp3 = example.getProductAfterDesiredDateDescendingOrder(LocalDate.of(2023, 9, 23));
            exp3.forEach(System.out::println);

        //     getProductThatHaveBeenModified()
        List<ImmutableObjectProduct> exp4 = example.getProductThatHaveBeenModified();
            exp4.forEach(System.out::println);


    }


}
