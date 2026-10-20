package com.cc.java.singleton;

import com.cc.java.tools.Helper;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
    
        // Klassische Instanziierung

        // Singleton obj = new Singleton();  // das geht nicht mehr !
        // Helper.output(obj);

        Singleton obj1 = Singleton.getInstance();
        Helper.output(obj1);

        obj1.actOnEvent();
        obj1.actOnEvent();
        // Events werden kumuliert ... 0 + 2
        Helper.output(obj1.getCounter());
        Helper.output("---------------------");




        
    }
    
}