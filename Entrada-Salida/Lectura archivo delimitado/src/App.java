import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        String archivoPath = "datos.csv";
        String separador = ",";

        ArrayList<objeto> objetos = new ArrayList<>();
        try {
            File archivo = new File(archivoPath);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(separador);
                if (partes.length == 2) {
                    String valor1 = partes[0];
                    String valor2 = partes[1];

                    objeto objeto = new objeto(valor1, valor2);
                    objetos.add(objeto);
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

        // Verificamos que los objetos se hayan creado correctamente
        for (objeto obj : objetos) {
            System.out.println(obj);
        }
    }
}
