package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] args) {
        InputDataCreator inputData = new InputDataCreator();
        SaleRequest saleRequest = inputData.createData();

        SaleProcessor saleProcessor = new SaleProcessor(new SmsService(), new HardSaleService(), new SalesDatabaseService());
        saleProcessor.process(saleRequest);
    }
}
