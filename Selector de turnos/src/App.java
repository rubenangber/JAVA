import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] personas = {"Paula", "Marta", "Rubén", "Marina"};
        Random random = new Random();
        Calendar calendario = Calendar.getInstance();
        int mesActual = calendario.get(Calendar.MONTH) + 1;

        switch (mesActual) {
            case 1:  System.out.println("ENERO DUMP");      break;
            case 2:  System.out.println("FEBRERO DUMP");    break;
            case 3:  System.out.println("MARZO DUMP");      break;
            case 4:  System.out.println("ABRIL DUMP");      break;
            case 5:  System.out.println("MAYO DUMP");       break;
            case 6:  System.out.println("JUNIO DUMP");      break;
            case 7:  System.out.println("JULIO DUMP");      break;
            case 8:  System.out.println("AGOSTO DUMP");     break;
            case 9:  System.out.println("SEPTIEMBRE DUMP"); break;
            case 10: System.out.println("OCTUBRE DUMP");    break;
            case 11: System.out.println("NOVIEMBRE DUMP");  break;
            case 12: System.out.println("DICIEMBRE DUMP");  break;
        }

        int cont = 0;
        do {
            int indiceAleatorio = random.nextInt(personas.length);
            if (personas[indiceAleatorio] != "x") {
                sc.nextLine();
                System.out.printf("%d) %s", cont + 1, personas[indiceAleatorio]);
                personas[indiceAleatorio] = "x";
                cont++;
            }
        } while (cont < 4);

        sc.close();
    }
}