package com.example;

public class CocheElectrico extends Coche {
    String motorElectrico;

    public CocheElectrico(String color, String fabricante, String modelo, Double peso, Double largo) {
        super(color, fabricante, modelo, peso, largo);
    }

    public CocheElectrico(String color, String fabricante, String modelo, Double peso, Double largo, String motorElectrico) {
        super(color, fabricante, modelo, peso, largo);
        this.motorElectrico = motorElectrico;
    }

    @Override
    public String toString() {
        return "CocheElectrico [color=" + color + 
        ", fabricante=" + fabricante + 
        ", modelo=" + modelo + 
        ", peso=" + peso + 
        ", largo=" + largo + 
        ", motorElectrico=" + motorElectrico + "]";
    }
    
}