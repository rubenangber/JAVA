public class App {
    public static void main(String[] args) throws Exception {
        String cadena = "Mensaje de texto";

        int longitud = cadena.length();
        System.out.println("La longitud de la cadena es >> " + longitud);
    
        //Convertir a mayuscula
        System.out.println(cadena.toUpperCase());
        //Convertir a minuscula
        System.out.println(cadena.toLowerCase());

        //Comprobar si empieza por 
        boolean resultado = cadena.startsWith("Men");
        System.out.println(resultado);
        resultado = cadena.startsWith("men"); //Distingue mayusculas y minusculas
        System.out.println(resultado);
        resultado = cadena.toLowerCase().startsWith("men");
        System.out.println(resultado);

        //Comprobar si termina por 
        resultado = cadena.endsWith("to");
        System.out.println(resultado);
        resultado = cadena.endsWith("TO"); //Distingue mayusculas y minusculas
        System.out.println(resultado);
        resultado = cadena.toUpperCase().endsWith("TO");
        System.out.println(resultado);
    }
}
