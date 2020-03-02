package com.singleton;

public enum SingletonEnum {
    /**
     * Implementing Singleton in Java 5 or above version using Enum:
     * Enum is thread safe and implementation of Singleton through Enum ensures that your singleton will have only one instance even
     * in a multithreaded environment. Let us see a simple implementation:
     */
    INSTANCE;


    public void doSomething(){
        System.out.println(INSTANCE.equals(INSTANCE));
    }

    public static void main(String [] args){
        SingletonEnum.INSTANCE.doSomething();
        SingletonEnum.INSTANCE.doSomething();
    }
}
