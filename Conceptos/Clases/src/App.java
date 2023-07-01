public class App {
    public static void main(String[] args) throws Exception {
        String color = "Negro";
        String fabricante = "Honda";
        String modelo = "Civic";
        double peso = 2032.45;
        double largo = 3.45;
        
        Coche car = new Coche(color, fabricante, modelo, peso, largo);
    
        System.out.println(car);
        
        int velocidad = 32;
        car.acelerar(velocidad);

        System.out.println(car);
    }
}
