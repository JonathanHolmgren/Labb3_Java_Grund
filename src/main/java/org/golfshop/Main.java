package org.golfshop;

import org.golfshop.entities.ImmutableObjectProduct;
import org.golfshop.entities.Product;
import org.golfshop.service.Warehouse;

import java.time.LocalDate;
import java.util.List;


public class Main {


    public static void main(String[] args) {

        Warehouse example = new Warehouse();

/*
        example.showAll();
        example.createANewProduct("rrr", 3, 69, Category.IRONS);
        example.showAll();
        example.updateAnExistingProduct(10, "Stealth 2 Ryder Cup Europe", 7, Category.DRIVER);
        example.showAll();
*/
      List<ImmutableObjectProduct> exp = example.getAllProduct();
       // exp.forEach(System.out::println);
      List<ImmutableObjectProduct> exp1 = example.getProductById(8);
        // exp1.forEach(System.out::println);

        List<ImmutableObjectProduct> exp2 = example.getProductByCategorySortAfterName(Category.PUTTER);
       // exp2.forEach(System.out::println);

        List<ImmutableObjectProduct> exp3 = example.getProductAfterDesiredDateDescendingOrder(LocalDate.of(2023, 9, 23));
       // exp3.forEach(System.out::println);

        List<ImmutableObjectProduct> exp4 = example.getProductThatHaveBeenModified();
        exp4.forEach(System.out::println);


    }


}
