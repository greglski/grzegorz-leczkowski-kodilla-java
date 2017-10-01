package com.kodilla.good.patterns.challenges;

public class SalesDTO {
    private Buyer buyer;
    private boolean isSold;

    public SalesDTO(Buyer buyer, boolean isSold) {
        this.buyer = buyer;
        this.isSold = isSold;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public boolean isSold() {
        return isSold;
    }
}
