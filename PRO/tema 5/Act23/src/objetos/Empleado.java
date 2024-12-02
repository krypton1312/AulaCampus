package objetos;

public class Empleado extends Persona {
    private int incorporacion;
    private int despacho;

    public Empleado(String nombre, String apellidos, int id, String estado_civil, int incorporacion, int despacho) {
        super(nombre, apellidos, id, estado_civil);
        this.incorporacion = incorporacion;
        this.despacho = despacho;
    }

    public int getIncorporacion() {
        return incorporacion;
    }

    public void setIncorporacion(int incorporacion) {
        this.incorporacion = incorporacion;
    }

    public int getDespacho() {
        return despacho;
    }

    public void setDespacho(int despacho) {
        this.despacho = despacho;
    }

    @Override
    public String toString() {
        return  super.toString() + "\nEmpleado{" + "incorporacion=" + incorporacion + ", despacho=" + despacho + '}';
    }

}
