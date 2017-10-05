package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShopSupplier implements SupplierOrderService{
    private String supplierName = "ExtraFoodShop";
    private String supplierCity = "Zamość";

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
