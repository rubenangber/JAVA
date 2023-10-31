import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<objeto> lista = new ArrayList<objeto>();
        objeto o = new objeto("Juan", "Perez");
        objeto o2 = new objeto("Juanito", "Perez");
        objeto o3 = new objeto("Juanin", "Perez");

        lista.add(o);
        lista.add(o2);
        lista.add(o3);

        String archivoPath = "datos.csv";
        String separador = ",";
        
        try {
            File archivo = new File(archivoPath);
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);

            for (objeto obj : lista) {
                String linea = String.join(separador, obj.getNombre(), obj.getApellido());
                linea += "\n";
                bw.write(linea);
            }

            bw.close();
            fw.close();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
