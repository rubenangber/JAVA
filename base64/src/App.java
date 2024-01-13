import java.util.Base64;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Ingrese texto >> ");
        String textoOriginal = sc.nextLine();

        String textoBase64 = codificarBase64(textoOriginal);
        System.out.println("Texto original >> " + textoOriginal);
        System.out.println("Texto en Base64 >> " + textoBase64);

        // Decodificación desde Base64
        String textoDecodificado = decodificarBase64(textoBase64);
        System.out.println("Texto decodificado >> " + textoDecodificado);
    }

    public static String codificarBase64(String texto) {
        byte[] bytesCodificados = Base64.getEncoder().encode(texto.getBytes());
        return new String(bytesCodificados);
    }

    public static String decodificarBase64(String textoBase64) {
        byte[] bytesDecodificados = Base64.getDecoder().decode(textoBase64.getBytes());
        return new String(bytesDecodificados);
    }
}
