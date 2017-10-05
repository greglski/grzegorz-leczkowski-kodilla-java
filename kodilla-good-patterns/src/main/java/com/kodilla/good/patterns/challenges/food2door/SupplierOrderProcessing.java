package com.kodilla.good.patterns.challenges.food2door;

public class SupplierOrderProcessing {
    private SupplierOrderService supplierOrderService;

    public SupplierOrderProcessing(SupplierOrderService supplierOrderService) {
        this.supplierOrderService = supplierOrderService;
    }

    public OrderDTO orderProcess(SupplierOrderRequest supplierOrderRequest) {
        boolean isOrdered = supplierOrderService.process(supplierOrderRequest);
        if (isOrdered) {
            System.out.println("Order processed");
            return new OrderDTO(supplierOrderRequest.getSupplierName(), isOrdered);
        } else {
            System.out.println("Order not processed");
            return new OrderDTO(supplierOrderRequest.getSupplierName(), isOrdered);
        }
    }

}
