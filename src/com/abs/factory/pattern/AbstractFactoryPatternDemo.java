package com.abs.factory.pattern;

public class AbstractFactoryPatternDemo {

    public static void main(String [] args){
        AbstractTransaction  orderTransaction = AbstractFactoryProducer.getFactory(true);
        Transaction t1 = orderTransaction.getTransaction("Order");
        System.out.println(t1.getType());
        System.out.println(t1.getCount());
        Transaction t2 = orderTransaction.getTransaction("line");
        System.out.println(t2.getType());
        System.out.println(t2.getCount());

        AbstractTransaction shipTransaction = AbstractFactoryProducer.getFactory(false);
        Transaction t3 = shipTransaction.getTransaction("Shipment");
        System.out.println(t3.getType());
        System.out.println(t3.getCount());
        Transaction t4 = shipTransaction.getTransaction("shipLine");
        System.out.println(t4.getType());
        System.out.println(t4.getCount());




    }
}
