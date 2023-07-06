import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUD {

    List<Empleado> empleados = new ArrayList<Empleado>();

    public void guardarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public List<Empleado>verEmpleados() {
        return empleados;
    }
    
}
