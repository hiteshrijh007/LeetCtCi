package com.abs.factory.pattern;

public abstract class AbstractTransaction {

    abstract Transaction getTransaction(String transactionType);
}
