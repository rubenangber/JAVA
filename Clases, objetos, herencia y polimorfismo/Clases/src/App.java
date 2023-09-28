public class App {
    public static void main(String[] args) throws Exception {
        Coche car = new Coche();
        System.out.println(car);
        Coche car2 = new Coche("Mercedes", "1234SAL", 4);
        System.out.println(car2);
        System.out.printf("%s", car2.getMatricula());
    }
}
