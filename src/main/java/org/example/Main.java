package org.example;

public class Main {
    public static void main(String[] args) {

        EagerInitialization.getInstance() ;
        System.out.println("************************");
        BlockStatic.getInstance() ;
        System.out.println("************************");
        LazyInitialization.getInstance() ;
        System.out.println("************************");
        LazyInitialization.getInstance() ;
        System.out.println("************************");
       for (int i = 0; i< 5; i++){
           ThreadSingleton.getDoubleCheckInstance() ;
           ThreadSingleton.getDoubleCheckInstance() ;
           ThreadSingleton.getDoubleCheckInstance() ;
       }




    }
}