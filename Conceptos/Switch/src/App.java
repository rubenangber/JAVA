public class App {
    public static void main(String[] args) throws Exception {
        String clima = "soleado";

        switch (clima) {
            case "soleado":
                System.out.println("El tiempo es soleado");
            break;

            case "lluvioso":
                System.out.println("El tiempo es lluvioso");
            break;

            case "nublado":
                System.out.println("El tiempo es nublado");
            break;

            case "tormenta":
                System.out.println("Hay una tormenta");
            break;

            default:
                System.out.println("No se ha encontrado el caso solicitado");
            break;
        }
    }
}
