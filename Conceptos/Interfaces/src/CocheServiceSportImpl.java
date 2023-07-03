public class CocheServiceSportImpl implements CocheService{

    public Coche crearCocheDemo() {
        System.out.println("Coche deportivo");
        return new Coche();
    }

    public void destruirCocheDemo(Coche c) {
        System.out.println("Destruyendo coche deportivo");
    }
}
