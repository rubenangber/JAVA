import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Introduce un nombre >> ");
        String nombre = sc.nextLine();
        System.out.printf("El nombre introducido es >> %s\n", nombre);
    
        System.out.printf("Introduce su edad >> ");
        int edad = sc.nextInt();
        System.out.printf("Su edad es >> %s\n", edad);
    }
}
