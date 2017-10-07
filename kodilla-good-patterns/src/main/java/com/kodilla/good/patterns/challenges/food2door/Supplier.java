package com.kodilla.good.patterns.challenges.food2door;

public interface Supplier {
    boolean process(SupplierOrderRequest supplierOrderRequest);
    String getSupplierName();
    String getSupplierCity();
}
