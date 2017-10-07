package com.kodilla.good.patterns.challenges.food2door;

import org.junit.Assert;
import org.junit.Test;

public class SupplierOrderProcessingTestSuite {
    @Test
    public void testOrderProcess() {
        // Given
        Supplier extraFoodShop = new ExtraFoodShopSupplier();
        Product product = new Product("P", "Por", 12.12);
        SupplierOrderRequest supplierOrderRequest = new SupplierOrderRequest(extraFoodShop, product, 10);
        // When
        SupplierOrderProcessing supplierOrderProcessing = new SupplierOrderProcessing();
        OrderDTO orderDTO = supplierOrderProcessing.orderProcess(supplierOrderRequest);
        String expectedSupplierName = "ExtraFoodShop";
        // Then
        Assert.assertEquals(expectedSupplierName, orderDTO.getSupplier().getSupplierName());
    }
}
