public class objeto {
    public String nombre;
    public String apellido;

    @Override
    public String toString() {
        return "objeto [nombre=" + nombre + ", apellido=" + apellido + "]";
    }

    public objeto(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
