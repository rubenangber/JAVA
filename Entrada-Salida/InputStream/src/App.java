import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class App {
    public static void main(String[] args) throws Exception {
        //Leer fichero
        try {
            InputStream fichero = new FileInputStream("c:/Users/ruben/OneDrive/Documentos/JAVA/Entrada-Salida/Documento.txt");
            
            try {
                //byte[] datos = fichero.readAllBytes();

                int datos2 = fichero.read();

                /*for (byte dato : datos) {
                    System.out.printf("%c", (char) dato);
                }*/

                while (datos2 != -1) {
                    System.out.printf("%c", (char) datos2);
                    datos2 = fichero.read();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
