package objetos;

public class Socio {
    private String id;
    private String nombre;
    private String apellido;
    private double peso;
    private double altura;
    private String cuota;

    public Socio(String id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Socio(String id, String nombre, String apellido, double peso, double altura, String cuota) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.altura = altura;
        this.cuota = cuota;
    }

    public Socio() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCuota() {
        return cuota;
    }

    public void setCuota(String cuota) {
        this.cuota = cuota;
    }

    @Override
    public String toString() {
        return "socio{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", peso=" + peso + ", altura=" + altura + ", cuota=" + cuota + '}';
    }

    
}
