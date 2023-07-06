public class SmartPhone extends SmartDevice {
    int ram;
    String sistema;

    public SmartPhone(String marca, String modelo, String color, int ram, String sistema) {
        super(marca, modelo, color);
        this.ram = ram;
        this.sistema = sistema;
    }

    @Override
    public String toString() {
        return "SmartPhone [marca=" + marca +
                            ", modelo=" + modelo +
                            ", color=" + color +
                            ", ram=" + ram + 
                            ", sistema=" + sistema + "]";
    }

}
