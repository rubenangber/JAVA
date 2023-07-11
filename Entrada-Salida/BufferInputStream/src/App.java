import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class App {
    public static void main(String[] args) throws Exception {
        
        try {
            InputStream fichero = new FileInputStream("c:/Users/ruben/OneDrive/Documentos/JAVA/Entrada-Salida/Documento.txt");
            BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero);
            
            try {
                int datos = ficheroBuffer.read();

                while (datos != -1) {
                    System.out.printf("%c", (char) datos);
                    datos = ficheroBuffer.read();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
