package org.example;

public class Main {
    public static void main(String[] args) {

        EagerInitialization.getInstance() ;
        System.out.println("************************");
        BlockStatic.getInstance() ;
    }
}