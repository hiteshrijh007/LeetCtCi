package com.abs.factory.pattern;

public class Order implements Transaction{

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public String getType() {
        return "This is an order";
    }
}
