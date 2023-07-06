import java.util.List;
import java.util.ArrayList;

public class EmpleadoCRUDMySQL implements EmpleadoCRUD {
    List<Empleado> empleados = new ArrayList<Empleado>();

    public void save(Empleado empleado){
        empleados.add(empleado);
    }

    public List<Empleado> findAll(){
        return empleados;
    }

    public void delete(Empleado empleado){
        empleados.remove(empleado);
    }
}
