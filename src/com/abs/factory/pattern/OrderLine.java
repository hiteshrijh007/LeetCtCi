package com.abs.factory.pattern;

public class OrderLine implements Transaction{
    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public String getType() {
        return "This is order line";
    }
}
