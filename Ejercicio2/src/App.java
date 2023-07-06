import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Introduzca el precio del producto >>");
        float precio = sc.nextFloat();

        float precioConIVA = IVA(precio);
        System.out.printf("El precio del producto con IVA es >> %f\n", precioConIVA);

        sc.close();
    }

    public static float IVA(float precio) {
        float IVA = 0.21f;
        float total = precio + (precio * IVA);
        return total;
    }
}
