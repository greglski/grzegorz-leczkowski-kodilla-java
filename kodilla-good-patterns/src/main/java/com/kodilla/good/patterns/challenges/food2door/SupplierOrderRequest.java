package com.kodilla.good.patterns.challenges.food2door;

public class SupplierOrderRequest {
    private String supplierName;
    private Product product;
    private long quantity;

    public SupplierOrderRequest(final String supplierName, final Product product, final long quantity) {
        this.supplierName = supplierName;
        this.product = product;
        this.quantity = quantity;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public Product getProduct() {
        return product;
    }

    public long getQuantity() {
        return quantity;
    }
}
