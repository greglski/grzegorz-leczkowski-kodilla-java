package com.kodilla.good.patterns.challenges;

public class SaleRequest {

    private Buyer buyer;
    private Product product;
    private long quantity;

    public SaleRequest(final Buyer buyer, final Product product, final long quantity) {
        this.buyer = buyer;
        this.product = product;
        this.quantity = quantity;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public Product getProduct() {
        return product;
    }

    public long getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product " + product.getProductID() + " | " +
               "sold to " + buyer.getBuyerNick() + " | " +
               "quantity=" + quantity;
    }
}
