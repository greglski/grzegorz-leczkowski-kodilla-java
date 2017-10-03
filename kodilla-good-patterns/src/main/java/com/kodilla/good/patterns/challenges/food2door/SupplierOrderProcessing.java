package com.kodilla.good.patterns.challenges.food2door;

public class SupplierOrderProcessing {
    private SupplierOrderService supplierOrderService;

    public SupplierOrderProcessing(SupplierOrderService supplierOrderService) {
        this.supplierOrderService = supplierOrderService;
    }

    public DTO orderProcess(SupplierOrderRequest supplierOrderRequest) {
        boolean order = supplierOrderService.process(supplierOrderRequest);
        if (order) {
            System.out.println("Order processed");
            return new DTO(supplierOrderRequest.getSupplierName(), order);
        } else {
            System.out.println("Order not processed");
            return new DTO(supplierOrderRequest.getSupplierName(), order);
        }
    }

}
