public class App {
    public static void main(String[] args) throws Exception {
        String nombre = "Ruben";

        int longitud = nombre.length(); //Longitud de la palabra
        System.out.println(longitud);

        String nombreMAY = nombre.toUpperCase(); //Mismo texto en mayusculas
        System.out.println(nombreMAY);

        String mensaje = " Hola mundo ";
        System.out.println(mensaje.trim()); //Elimina espacios alante y detras

        if (nombre.equals(mensaje)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

        if (nombre.equalsIgnoreCase(nombreMAY)) { //Ignora mayusculas y minusculas
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

    }
}
