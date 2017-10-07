package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShopSupplier implements Supplier {
    private String supplierName = "HealthyShop";
    private String supplierCity = "Ryki";

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
