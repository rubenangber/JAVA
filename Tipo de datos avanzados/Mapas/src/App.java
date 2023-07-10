import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        Map<String, Integer> map = new HashMap<>();

        map.put("Clave 1", 10);
        map.put("Clave 2", 20);
        map.put("Clave 3", 30);

        System.out.println(map);

        map.put("Clave 3", 100); //Se sobreescribe
        System.out.println(map);

        System.out.println(map.get("Clave 1"));

        for (Map.Entry elemento : map.entrySet()){
            System.out.println("Elemento clave es >> " + elemento.getKey());
            System.out.println("Elemento valor es >> " + elemento.getValue());
        }
    }
}
