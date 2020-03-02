package com.abs.factory.pattern;

public class ShipmentFactory extends AbstractTransaction{
    @Override
    Transaction getTransaction(String transactionType) {
        if(transactionType.equals("Shipment")){
            return new Shipment();
        }else{
            return new ShipmentLine();
        }
    }
}
