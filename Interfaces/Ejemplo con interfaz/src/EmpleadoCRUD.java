import java.util.List;

public interface EmpleadoCRUD {
    //NO se implementan los métodos, solo se declaran
    void save(Empleado empleado);

    List<Empleado> findAll();

    void delete(Empleado empleado);

}
