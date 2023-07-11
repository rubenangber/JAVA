import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class App {
    public static void main(String[] args) throws Exception {
        //Escribir 
        /*
        PrintStream info = new PrintStream("copia.txt");
        info.println("Hola");
        */
        try {
            InputStream in = new FileInputStream("c:/Users/ruben/OneDrive/Documentos/JAVA/Entrada-Salida/Documento.txt");
            byte[] bytes = in.readAllBytes();

            PrintStream out = new PrintStream("copia.txt");
            out.write(bytes);
        } catch (Exception e) {
            e.getMessage();
        }
        
    }
}

