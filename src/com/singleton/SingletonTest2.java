package com.singleton;

public final class SingletonTest2 {

    private static SingletonTest2 INSTANCE;

    private SingletonTest2(){}

    /**
     * In the multithreading environment to prevent each thread to create another instance of singleton
     * object and thus creating concurrency issue we will need to use locking mechanism. This can be
     * achieved by synchronized keyword. By using this synchronized keyword we prevent
     * Thread2 or Thread3 to access the singleton instance while Thread1 inside the method getSingletonInstance().
     * @return
     */
    public static synchronized SingletonTest2 getInstance(){
        if(INSTANCE== null){
            System.out.println("Creating an instace");
            INSTANCE = new SingletonTest2();
        }
        System.out.println("returning an instance");
        return INSTANCE;
    }
    public void log(String s){
        System.out.println(s);
    }

    public  static void main(String [] args){
        SingletonTest2 s = SingletonTest2.getInstance();
        System.out.println(s);
        SingletonTest2 s1 = SingletonTest2.getInstance();
        System.out.println(s1);


    }


}
