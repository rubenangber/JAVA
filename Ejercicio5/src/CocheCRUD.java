import java.util.List;

public interface CocheCRUD {
    void save(String coche);

    List<String> findAll();

    void delete(String coche);
}
