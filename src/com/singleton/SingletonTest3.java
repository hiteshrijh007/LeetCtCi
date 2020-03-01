package com.singleton;

public final class SingletonTest3 {

    private static volatile SingletonTest3 INSTANCE;

    private SingletonTest3(){}

    /**
     * What is the Java volatile keyword?
     * Essentially, volatile is used to indicate that a variable's value will be modified by different threads.
     *
     * Declaring a volatile Java variable means:
     *
     * The value of this variable will never be cached thread-locally: all reads and writes will go straight to "main memory";
     * Access to the variable acts as though it is enclosed in a synchronized block, synchronized on itself.
     * We say "acts as though" in the second point, because to the programmer at least
     * (and probably in most JVM implementations) there is no actual lock object involved.
     * In other words, the main differences between synchronized and volatile are:
     *
     * a primitive variable may be declared volatile (whereas you can't synchronize on a primitive with synchronized);
     * an access to a volatile variable never has the potential to block: we're only ever doing a simple read or write, so unlike a
     * synchronized block we will never hold on to any lock;
     * because accessing a volatile variable never holds a lock, it is not suitable for cases where we want to read-update-write as an
     * atomic operation (unless we're prepared to "miss an update");
     * a volatile variable that is an object reference may be null (because you're effectively synchronizing on the reference, not the actual object).
     * Attempting to synchronize on a null object will throw a NullPointerException.
     * @return
     */
    public static  SingletonTest3 getInstance(){
        if(INSTANCE== null){
            System.out.println("Creating an instace");
            INSTANCE = new SingletonTest3();
        }
        System.out.println("returning an instance");
        return INSTANCE;
    }
    public void log(String s){
        System.out.println(s);
    }

    public  static void main(String [] args){
        SingletonTest3 s = SingletonTest3.getInstance();
        System.out.println(s);
        SingletonTest3 s1 = SingletonTest3.getInstance();
        System.out.println(s1);


    }


}
