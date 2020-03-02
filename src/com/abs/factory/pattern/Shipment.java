package com.abs.factory.pattern;

public class Shipment implements Transaction{
    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public String getType() {
        return "This is Shipment";
    }
}
