package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShopSupplier implements SupplierOrderService {
    private String supplierName = "HealthyShop";
    private String supplierCity = "Ryki";

    public boolean process(SupplierOrderRequest supplierOrderRequest) {
        if (supplierOrderRequest.getSupplierName().equals(this.supplierName)) {
            System.out.println("Processing isOrdered the " + supplierOrderRequest.getSupplierName() + " way." + "\n" +
                    "Ordered product: " + supplierOrderRequest.getProduct().getProductName() +
                    "; quantity: " + supplierOrderRequest.getQuantity());
            return true;
        }
        return false;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getSupplierCity() {
        return supplierCity;
    }
}
