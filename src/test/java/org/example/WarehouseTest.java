package org.example;

import org.assertj.core.internal.IterableElementComparisonStrategy;
import org.golfshop.Category;
import org.golfshop.entities.ImmutableObjectProduct;
import org.golfshop.entities.Product;
import org.golfshop.service.Warehouse;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;


public class WarehouseTest {


    @Test // Kanske lite onödig
    public void IsWarehouseEmpty() {
        Warehouse warehouseTest = new Warehouse();
        ArrayList<Product> productList = warehouseTest.getProductList();
        assertThat(productList)
                .isEmpty();
    }


    @Test
    public void whenWeCreateAProductTheListShouldNotBeEmpty() {
        Warehouse warehouseTest = new Warehouse();

        warehouseTest.createANewProduct("Test Putter", 9, 3999, Category.PUTTER);
        ArrayList<Product> productList = warehouseTest.getProductList();
        assertThat(productList)
                .isNotEmpty();
    }


    @Test
    public void WhenYouUpdateAnProductTheUpdatedVersionShouldChangeToChangedValue() {
        Warehouse warehouseTest = new Warehouse();
        warehouseTest.createANewProduct("Test Putter", 9, 3999, Category.PUTTER);
        warehouseTest.updateAnExistingProduct(1, "NewName", 8, Category.IRONS);
        ArrayList<Product> productList = warehouseTest.getProductList();

        Product product = null;
        for (Product p : productList
        ) {
            if (p.getId() == 1) product = p;
        }
        assertThat(product).isNotNull().extracting("id", "name").containsExactly(1, "NewName");
    }

    @Test
    public void CheckIfYouGetAllProductFromWareHouse() {
        Warehouse warehouseTest = new Warehouse();
        warehouseTest.createANewProduct("Test Putter", 9, 3999, Category.PUTTER);
        warehouseTest.createANewProduct("Test Driver", 9, 3999, Category.DRIVER);

        List<ImmutableObjectProduct> productList = warehouseTest.getAllProduct();

        assertThat(productList).hasSize(2);

    }


}
