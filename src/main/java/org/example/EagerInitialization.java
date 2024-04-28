package org.example;

public class EagerInitialization {

    //on declare et on initialise l'instance de la classe
    private static final EagerInitialization instance = new EagerInitialization() ;
    private EagerInitialization() {}

    //Une methode pour retourner getInstance
    public static EagerInitialization getInstance(){
        System.out.println("Initization d'instance de la classe par Eager");
        return instance ;
    }

}
