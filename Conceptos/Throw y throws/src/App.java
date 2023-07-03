import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try {
            leerNombres();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

     private static void leerNombres() throws Exception {
            
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce un nombre >> ");
        while (sc.hasNext()) {
            System.out.printf("Introduce un nombre >> ");
            String nombre = sc.nextLine();
            if (nombre.length() < 8) {
                sc.close();
                throw new Exception("El nombre debe de contener minimo 8 caracteres");
            }
        }
        sc.close();
    }
}
