package com.kodilla.good.patterns.challenges;

public class Buyer {
    private String buyerNick;
    private String buyerFirstName;
    private String buyerLastName;

    public Buyer(String buyerNick, String buyerFirstName, String buyerLastName) {
        this.buyerNick = buyerNick;
        this.buyerFirstName = buyerFirstName;
        this.buyerLastName = buyerLastName;
    }

    public String getBuyerNick() {
        return buyerNick;
    }

    public String getBuyerFirstName() {
        return buyerFirstName;
    }

    public String getBuyerLastName() {
        return buyerLastName;
    }
}
