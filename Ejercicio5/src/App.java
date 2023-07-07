import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        CocheCRUD cocheCRUD = new CocheCRUDImpl();
        List<String> lista = new ArrayList<String>();

        cocheCRUD.save("Ferrari");
        cocheCRUD.save("Audi");

        lista = cocheCRUD.findAll();
        System.out.println(lista);

        cocheCRUD.delete("Ferrari");
        lista = cocheCRUD.findAll();
        System.out.println(lista);
        
    }
}
