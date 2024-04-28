package org.example;

public class LazyInitialization {

    private static LazyInitialization instance = null ;
    private LazyInitialization () {}

    // cette methode permet de creer l'instance a la demande et pas a l'avant
    public static LazyInitialization getInstance() {
        if (instance == null){
            System.out.println("Creation de la nouvelle instance");
            instance = new LazyInitialization() ;
            return instance ;
        }
        System.out.println("Retourne l'instance de la classe");
        return instance ;
    }

}
