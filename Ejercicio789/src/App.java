import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class App {
    
    public static class Reves {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.printf("Introduce el texto >> "); 
            String texto = sc.nextLine();

            StringBuilder reves = new StringBuilder(texto);
            texto = reves.reverse().toString();
            
            System.out.println(texto);

            sc.close();
        }
    }

    public static class Unidimensional {
        public static void main(String[] args) {
            String[] array = {"a", "b", "c", "d", "e"};
            
            for (String string : array) {
                System.out.println(string);
            }
        }
    }

    public static class Bidimensional {
        public static void main(String[] args) {
            int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.printf("%d ", array[i][j]);
                }
                System.out.println();
            }
        }
    }

    public static class ejVector {
        public static void main(String[] args) {
            Vector vector = new Vector();

            vector.add(1);
            vector.add(2);
            vector.add(3);
            vector.add(4);
            vector.add(5);

            System.out.println(vector);

            vector.remove(2);
            vector.remove(1);

            System.out.println(vector);
        }
    }

    public static class ArrayL {
        public static void main(String[] args) {
            List<String> lista = new ArrayList<>();

            lista.add("1");
            lista.add("2");
            lista.add("3");
            lista.add("4");

            List<String> listaCopia = new LinkedList<>();

            for (int i = 0; i < lista.size(); i++) {
                listaCopia.add(i, lista.get(i));
            }

            System.out.println("ArrayList");
            for (String string : lista) {
                System.out.println(string);
            }

            System.out.println("LinkedList");
            for (String string : listaCopia) {
                System.out.println(string);
            }
        }
    }

    public static class Pares {
        public static void main(String[] args) {
            List<Integer> lista = new ArrayList<>();

            for (int i = 0; i < 10; i++) {
                lista.add(i + 1);
            }

            System.out.println(lista);

            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i) % 2 == 0) {
                    lista.remove(i);
                }
            }

            System.out.println(lista);
        }
    }

    public static class Cero {
        private static int Division (int num1, int num2) throws ArithmeticException {
            return num1 / num2;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.printf("Introduce el primer numero >> ");
            int num1 = sc.nextInt();
            System.out.printf("Introduce el segundo numero >> ");
            int num2 = sc.nextInt();

            try {
                int resultado = Division(num1, num2);
                System.out.printf("El resultado de la division es >> %d\n", resultado);
                sc.close();
            } catch (ArithmeticException e) {
                e.getMessage();
            }
        }
    }

    public static class CopiaFichero {
        public static void main(String[] args) {
            try {
            InputStream in = new FileInputStream("c:/Users/ruben/OneDrive/Documentos/JAVA/Entrada-Salida/Documento.txt");
            byte[] bytes = in.readAllBytes();

            PrintStream out = new PrintStream("copia.txt");
            out.write(bytes);

            in.close();
            out.close();
        } catch (Exception e) {
            e.getMessage();
        }
        }
    }
}