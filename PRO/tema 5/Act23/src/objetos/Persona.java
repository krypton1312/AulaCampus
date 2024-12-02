package objetos;

public class Persona {
    private String nombre;
    private String apellidos;
    private int id;
    private String estado_civil;

    public Persona(String nombre, String apellidos, int id, String estado_civil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.id = id;
        this.estado_civil = estado_civil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", id=" + id + ", estado_civil=" + estado_civil + '}';
    }
    
    
}
