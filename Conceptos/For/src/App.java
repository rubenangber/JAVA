public class App {
    public static void main(String[] args) throws Exception {
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Hola mundo");
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
}
