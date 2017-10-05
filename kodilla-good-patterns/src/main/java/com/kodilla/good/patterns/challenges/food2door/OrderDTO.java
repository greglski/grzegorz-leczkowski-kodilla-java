package com.kodilla.good.patterns.challenges.food2door;

public class OrderDTO {
    public String supplierName;
    public boolean isOrdered;

    public OrderDTO(final String supplierName, final boolean isOrdered) {
        this.supplierName = supplierName;
        this.isOrdered = isOrdered;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
