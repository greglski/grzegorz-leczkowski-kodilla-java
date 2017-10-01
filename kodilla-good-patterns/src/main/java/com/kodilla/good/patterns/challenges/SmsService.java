package com.kodilla.good.patterns.challenges;

public class SmsService implements InformationService {

    public void sendInformation(Buyer buyer) {
        System.out.println("Sending SMS to " + buyer.getBuyerFirstName() + " " + buyer.getBuyerLastName());
    }
}
