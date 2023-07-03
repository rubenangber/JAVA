public class App {
    public static void main(String[] args) throws Exception {
        try {
            int result = 5 / 0;
        } catch (ArithmeticException e) {
            //Codigo que queremos llevar a cabo si salta la excepcion
            e.printStackTrace();
        } finally {
            //Se ejecuta siempre
            System.out.println("Cierre de recursos");
        }

        System.out.println("Fin");
    }
}
