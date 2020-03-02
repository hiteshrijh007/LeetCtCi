package com.abs.factory.pattern;

public class AbstractFactoryProducer {

    public static AbstractTransaction getFactory(boolean order){
        if(order){
            return new OrderFactory();
        }else{
            return new ShipmentFactory();
        }
    }
}
