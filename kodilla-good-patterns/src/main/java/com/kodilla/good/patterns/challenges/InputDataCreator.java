package com.kodilla.good.patterns.challenges;

public class InputDataCreator {
    public SaleRequest createData() {
        Buyer buyer = new Buyer("JohnD", "John", "Doe");
        Product product = new Product("001adi", "Adidas Barricade", 10);
        long quantity = 1;
        return new SaleRequest(buyer, product, quantity);
    }
}
