package com.kodilla.good.patterns.challenges.food2door;

public class DTO {
    public String supplierName;
    public boolean order;

    public DTO(final String supplierName, final boolean order) {
        this.supplierName = supplierName;
        this.order = order;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public boolean isOrder() {
        return order;
    }
}
