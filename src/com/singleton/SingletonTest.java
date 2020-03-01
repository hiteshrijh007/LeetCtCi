package com.singleton;

public final class SingletonTest {

    private static SingletonTest INSTANCE;

    private SingletonTest(){}

    public static SingletonTest getInstance(){
        if(INSTANCE== null){
            System.out.println("Creating an instace");
            INSTANCE = new SingletonTest();
        }
        System.out.println("returning an instance");
        return INSTANCE;
    }
    public void log(String s){
        System.out.println(s);
    }

    public  static void main(String [] args){
        SingletonTest s = SingletonTest.getInstance();
        System.out.println(s);
        SingletonTest s1 = SingletonTest.getInstance();
        System.out.println(s1);


    }


}
