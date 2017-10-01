package com.kodilla.good.patterns.challenges;

public class SalesDatabaseService implements DatabaseService {

    public void databaseEntry(SaleRequest saleRequest) {
        System.out.println("Writing sales to database: " + saleRequest.toString());
    }
}
