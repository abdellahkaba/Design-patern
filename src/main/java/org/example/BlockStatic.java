package org.example;

public class BlockStatic {

    private static BlockStatic instance ;
    private BlockStatic () {}
    // on creer un bloc static
    static {
        try{
            instance = new BlockStatic() ;
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
    public static BlockStatic getInstance() {
        System.out.println("Static de block instance");
        return instance ;
    }
}
