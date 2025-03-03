package ejemplodb4o;

public class Alumno {
    private String nia;
    private String nombre;
    private String apellidos;
    private double nota;
    private String Observaciones;

    public Alumno(String nia, String nombre, String apellidos, double nota, String Observaciones) {
        this.nia = nia;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nota = nota;
        this.Observaciones = Observaciones;
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
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nia=" + nia + ", nombre=" + nombre + ", apellidos=" + apellidos + ", nota=" + nota + ", Observaciones=" + Observaciones + '}';
    }
}
