package com.abs.factory.pattern;

public class OrderFactory extends AbstractTransaction{
    @Override
    Transaction getTransaction(String transactionType) {
        if(transactionType.equals("Order")){
            return new Order();
        }else{
            return new OrderLine();
        }
    }
}
