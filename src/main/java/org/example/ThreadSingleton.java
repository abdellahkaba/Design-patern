package org.example;

public class ThreadSingleton {

    private static ThreadSingleton instance  ;
    private ThreadSingleton (){
    }

    public static synchronized ThreadSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSingleton() ;
            System.out.println("Synchronize thread instance de la classe");
            return instance ;
        }

        System.out.println("Returning Synchronize thread instance de la classe");

        return instance ;
    }
}
