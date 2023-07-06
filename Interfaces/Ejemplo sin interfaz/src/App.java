import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Empleado> listaEmpleados = new ArrayList<Empleado>();
        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();
        
        Empleado Juanito = new Empleado("Juanito", 30, 40, true); 
        Empleado Patricia = new Empleado("Patricia", 30, 40, true);
        Empleado Roberto = new Empleado("Roberto", 30, 40, true);

        empleadoCRUD.guardarEmpleado(Juanito);
        empleadoCRUD.guardarEmpleado(Patricia);
        empleadoCRUD.guardarEmpleado(Roberto);

        listaEmpleados = empleadoCRUD.verEmpleados();
        System.out.println(listaEmpleados);
    }
}
