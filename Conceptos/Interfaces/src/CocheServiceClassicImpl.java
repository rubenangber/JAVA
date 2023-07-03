public class CocheServiceClassicImpl implements CocheService{

    public Coche crearCocheDemo() {
        System.out.println("Coche clasico");
        return new Coche();
    }

    public void destruirCocheDemo(Coche c) {
        System.out.println("Destruyendo coche clasico");
    }
    
}
