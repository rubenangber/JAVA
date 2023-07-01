public class App {
    public static void main(String[] args) throws Exception {
        int i = 0;
        
        while (i < 10) {
            System.out.printf("%d\n", i);
            i++;
        }

        //Continue y Break
        int cont = 0;

        while (cont < 10) {
            cont++;

            if (cont == 6) {
                continue; //Se omiten todas las instrucciones restantes dentro del bucle 
                          //y se pasa a la siguiente iteración
            }

            System.out.printf("%d\n", cont);
        }

        cont = 0;

        while (cont < 10) {
            cont++;

            if (cont == 6) {
                break; //Se omiten todas las instrucciones restantes dentro del bucle
                       //rompe el flujo de ejecución
            }

            System.out.printf("%d\n", cont);
        }
    }
}
