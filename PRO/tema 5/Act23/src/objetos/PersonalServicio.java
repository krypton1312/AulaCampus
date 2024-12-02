package objetos;

public class PersonalServicio extends Empleado{
    private String seccion;

    public PersonalServicio(String nombre, String apellidos, int id, String estado_civil, int incorporacion, int despacho, String seccion) {
        super(nombre, apellidos, id, estado_civil, incorporacion, despacho);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return super.toString() + "PersonalServicio{" + "seccion=" + seccion + '}';
    }
    
}
