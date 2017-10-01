package com.kodilla.good.patterns.challenges;

public class HardSaleService implements SaleService {

    public boolean sold(SaleRequest saleRequest) {
        System.out.println(saleRequest.toString());
        return true;
    }
}
