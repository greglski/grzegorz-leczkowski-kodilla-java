package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShopSupplier implements Supplier {
    private String supplierName = "ExtraFoodShop";
    private String supplierCity = "Zamość";

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
