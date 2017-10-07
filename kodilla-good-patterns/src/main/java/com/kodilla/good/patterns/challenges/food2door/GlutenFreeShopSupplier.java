package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShopSupplier implements Supplier {
    private String supplierName = "GlutenFreeShop";
    private String supplierCity = "Rowy";

    @Override
    public boolean process(SupplierOrderRequest supplierOrderRequest) {
        System.out.println("Processing isOrdered the " + supplierOrderRequest.getSupplier().getSupplierName() + " way." + "\n" +
                "Ordered product: " + supplierOrderRequest.getProduct().getProductName() +
                "; quantity: " + supplierOrderRequest.getQuantity());
        return true;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getSupplierCity() {
        return supplierCity;
    }
}
