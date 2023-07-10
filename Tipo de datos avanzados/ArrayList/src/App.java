import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<String>();

        list.add("Elemento 1");
        list.add("Elemento 2");
        list.add("Elemento 3");

        System.out.println(list);

        list.remove("Elemento 2");
        System.out.println(list);

        list.add("Elemento 1");
        System.out.println(list);
        list.remove("Elemento 1"); //Solo borra 1
        System.out.println(list);

        for (String string : list) {
            System.out.println(string);
        }

    }
}
