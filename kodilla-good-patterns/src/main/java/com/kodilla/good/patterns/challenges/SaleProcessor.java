package com.kodilla.good.patterns.challenges;

public class SaleProcessor {

    private InformationService informationService;
    private SaleService saleService;
    private DatabaseService databaseService;

    public SaleProcessor(final InformationService informationService,
                         final SaleService saleService,
                         final DatabaseService databaseService) {
        this.informationService = informationService;
        this.saleService = saleService;
        this.databaseService = databaseService;
    }

    public SalesDTO process(final SaleRequest saleRequest) {
        boolean isSold = saleService.sold(saleRequest);
        if (isSold) {
            informationService.sendInformation(saleRequest.getBuyer());
            databaseService.databaseEntry(saleRequest);
            return new SalesDTO(saleRequest.getBuyer(), true);
        } else {
            return new SalesDTO(saleRequest.getBuyer(), false);
        }
    }
}
