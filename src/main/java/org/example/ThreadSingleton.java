package org.example;

public class ThreadSingleton {

    private static ThreadSingleton instance  ;
    private ThreadSingleton (){
    }

    public static ThreadSingleton getDoubleCheckInstance() {
        if (instance == null) {
            synchronized (ThreadSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSingleton() ;
                    System.out.println("Double ThreadSaveDoubleCheick");
                }
            }
            return instance ;
        }

        System.out.println("Returning Synchronize thread instance DoubleCheck de la classe");

        return instance ;
    }
}
