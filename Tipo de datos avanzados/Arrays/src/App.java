public class App {
    public static void main(String[] args) throws Exception {
        int[] vector = new int[5];
        vector[0] = 0;
        vector[1] = 1;
        vector[2] = 2;
        vector[3] = 3;
        vector[4] = 4;
        
        for (int i = 0; i < vector.length; i++) {
            System.out.printf("%d ", vector[i]);
        }

        int[][] matriz = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = 5;
            }
        }

        System.out.println("");
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println("");
        }
    }
}
