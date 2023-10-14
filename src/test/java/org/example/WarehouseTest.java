package org.example;

import org.golfshop.Category;
import org.golfshop.entities.ImmutableObjectProduct;
import org.golfshop.entities.Product;
import org.golfshop.service.Warehouse;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.reverseOrder;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;


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
    public void giveAnEmptyNameThrowException() {
        Warehouse warehouseTest = new Warehouse();

        assertThrows(IllegalArgumentException.class, () -> {
            warehouseTest.createANewProduct("", 9, 3, Category.IRONS);
        });
    }

    @Test
    public void giveNegativePriceThrowException() {
        Warehouse warehouseTest = new Warehouse();

        assertThrows(IllegalArgumentException.class, () -> {
            warehouseTest.createANewProduct("gffg", 9, -3, Category.IRONS);
        });
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
    public void WhenUpdateAProductAndGivenAnEmptyNameThrowException() {
        Warehouse warehouseTest = new Warehouse();

        assertThrows(IllegalArgumentException.class, () -> {
            warehouseTest.updateAnExistingProduct(1, "", 3, Category.IRONS);
        });
    }

    @Test
    public void CheckIfYouGetAllProductFromWareHouse() {
        Warehouse warehouseTest = new Warehouse();
        warehouseTest.createANewProduct("Test Putter", 9, 3999, Category.PUTTER);
        warehouseTest.createANewProduct("Test Driver", 9, 3999, Category.DRIVER);

        List<ImmutableObjectProduct> productList = warehouseTest.getAllProduct();
        assertThat(productList).hasSize(2);
    }

    @Test
    public void ShouldReturnAllPutters() {
        Warehouse warehouseTest = new Warehouse();
        warehouseTest.addMockDateToWarehouse();
        List<ImmutableObjectProduct> productList = warehouseTest.getProductByCategorySortAfterName(Category.PUTTER);

        assertThat(productList).extracting("category").containsOnly(Category.PUTTER);
    }

    @Test
    public void returnSameCategorySortedByTheNameFromATOZ() {
        Warehouse warehouseTest = new Warehouse();
        warehouseTest.addMockDateToWarehouse();

        assertThat(warehouseTest.getProductByCategorySortAfterName(Category.PUTTER).get(0).name()).startsWith("Sp");
    }

    @Test
    public void ShouldOnlyReturnProductsCreatedAfterDesiredDate() {
        Warehouse warehouseTest = new Warehouse();
        warehouseTest.addMockDateToWarehouse();
        List<ImmutableObjectProduct> productList = warehouseTest.getProductAfterDesiredDateDescendingOrder(LocalDate.of(2023, 9, 23));

        boolean OnlyProductsAfterDesiredDate = productList.stream().anyMatch(p -> p.createdDate().isAfter(LocalDate.of(2023, 9, 23)));

        assertThat(OnlyProductsAfterDesiredDate).isTrue();
    }

    @Test
    public void getProductAfterDesiredDateShouldBeInDescendingOrder() {
        Warehouse warehouseTest = new Warehouse();
        warehouseTest.addMockDateToWarehouse();

        LocalDate desiredDate = LocalDate.of(2023, 9, 23);

        assertThat(warehouseTest.getProductAfterDesiredDateDescendingOrder(desiredDate)).extracting("createdDate").isSortedAccordingTo(reverseOrder());
    }

    @Test
    public void ShouldOnlyReturnProductThatBeenModified() {
        Warehouse warehouseTest = new Warehouse();
        warehouseTest.addMockDateToWarehouse();

        assertThat(warehouseTest.getProductThatHaveBeenModified().size()).isEqualTo(6);

    }
}
