public class App {

    /* 
    Public / Private / Protected
     
     Es la visibilidad de la funcion y acceso
     public --> Acceso desde cualquier lugar
     private --> Acceso solo dentro de la misma clase
     protected --> Acceso dentro de la misma clase, subclases y mismo paquete
    */
    public static void main(String[] args) throws Exception {
        HolaMundo();

        int num1 = 5;
        int num2 = 10;

        System.out.printf("%d + %d >> %d\n", num1, num2, Suma(num1, num2));
    }

    private static void HolaMundo() {
        System.out.println("Hola mundo");
    }

    private static int Suma(int num1, int num2) {
        return num1 + num2;
    }
}
