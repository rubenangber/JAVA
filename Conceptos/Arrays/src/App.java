public class App {
    public static void main(String[] args) throws Exception {
        int[] notas1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] notas = new int[10];

        notas[0] = 8;
        notas[1] = 9;

        System.out.println(notas[0]);

        for (int item : notas1) { //foreach
            System.out.println(item);
        }

        for (int i = 0; i < notas1.length; i++) { //for
            System.out.println(notas1[i]);
        }
    }
}
