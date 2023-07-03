public class App {
    public static void main(String[] args) throws Exception {
        /*
        Una clase abstracta en Java es una clase que no se puede instanciar directamente, 
        es decir, no se puede crear un objeto de ella 
        Sirve como una plantilla o modelo para otras clases 
        relacionadas que sí pueden ser instanciadas
        */

        // NO se puede --> Coche car = new Coche();

        CocheElectrico coche = new CocheElectrico(null, null, null, null, null, null);
    }
}
