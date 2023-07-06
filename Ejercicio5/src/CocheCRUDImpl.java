import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {
    List<String> coches = new ArrayList<String>();

    public void save(String coche){
        coches.add(coche);
    }

    public List<String> findAll(){
        return coches;
    }

    public void delete(String coche){
        coches.remove(coche);
    }
}
