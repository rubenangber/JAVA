import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        Map<String, String> personas = new HashMap<>();
          //Key     Value
        personas.put("1234", "Ruben");
        personas.put("1235", "Sara");
        personas.put("1236", "Raul");

        System.out.println(personas);

        for (String key : personas.keySet()) {
            System.out.println(key);
        }

        for (String values : personas.values()) {
            System.out.println(values);
        }

        for (Map.Entry<String, String> pair: personas.entrySet()) {
            System.out.println(pair.getKey() + "-" + pair.getValue());
        }
    }
}
