public class App {
    public static void main(String[] args) throws Exception {
        CocheService service1 = new CocheServiceClassicImpl();
        CocheService service2 = new CocheServiceSportImpl();

        Coche car1 = service1.crearCocheDemo();
        System.out.println(car1);
        
        Coche car2 = service2.crearCocheDemo();
        System.out.println(car2);
    }
}
