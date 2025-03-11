package ejemplodb4o;

public class Alumno {
    private String nia;
    private String nombre;
    private String apellidos;
    private double nota;
    private String observaciones;

    public Alumno(String nia, String nombre, String apellidos, double nota, String observaciones) {
        this.nia = nia;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nota = nota;
        this.observaciones = observaciones;
    }

    public String getNia() {
        return nia;
    }

    public void setNia(String nia) {
        this.nia = nia;
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

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nia=" + nia + ", nombre=" + nombre + ", apellidos=" + apellidos + ", nota=" + nota + ", observaciones=" + observaciones + '}';
    }
    
    
}
