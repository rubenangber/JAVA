package com.example;

public class App {
    public static void main(String[] args) throws Exception {
        CocheElectrico cocheElectrico = new CocheElectrico("Azul", "Honda", "Civic", 1980.4, 3.14, "TXZ");
    
        System.out.println(cocheElectrico);

        cocheElectrico.setColor("Amarillo");
        System.out.println(cocheElectrico);
    }
}
