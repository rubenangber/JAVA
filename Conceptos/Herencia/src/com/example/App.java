package com.example;

public class App {
    public static void main(String[] args) throws Exception {
        CocheElectrico cocheElectrico = new CocheElectrico("Azul", "Honda", "Civic", 1980.4, 3.14, "TXZ");
    
        System.out.println(cocheElectrico);
    
        cocheElectrico.acelerar(50);
        System.out.println(cocheElectrico);

        //Polimorfismo
        Coche coche1 = new CocheElectrico(null, null, null, null, null);
        
        if (coche1 instanceof Coche) { 
            System.out.println("Coche");
        }
        
        if (coche1 instanceof CocheElectrico) { 
            System.out.println("Coche electrico");
        }
    }
}
