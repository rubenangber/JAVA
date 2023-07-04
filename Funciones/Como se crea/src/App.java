public class App {
    public static void main(String[] args) throws Exception {
        showMenu();

        int num1 = 10;
        int num2 = 20;
        int resultado = suma(num1, num2);

        System.out.println(resultado);
    }

    public static void showMenu() {
        System.out.println("Bienvenido al comercio de zapatillas");
        System.out.println("1 - Ver zapatillas");
        System.out.println("2 - Comprar zapatilla");
        System.out.println("3 - Salir");
    }

    public static int suma(int num1, int num2) {
        return num1 + num2;
    }
}
