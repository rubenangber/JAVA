public class Coche {
    private String nombre;
    private String matricula;
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Coche() {
        
    }

    public Coche(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Coche [nombre=" + nombre + ", matricula=" + matricula + "]";
    }
}
