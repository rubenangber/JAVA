import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> nombres = new ArrayList<>();

        nombres.add("Ruben");
        nombres.add("Oscar");
        nombres.add("Andrea");
        nombres.add("Alvaro");

        System.out.println(nombres);

        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        List<Coche> coches = new ArrayList<Coche>();

        coches.add(new Coche("Audi", "3219SA"));
        coches.add(new Coche("Mercedes", "3191SA"));

        System.out.println(coches);

        for (Coche coche : coches) {
            System.out.println(coche);
        }
    }
}
