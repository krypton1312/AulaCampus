package objetos;

public class Profesores extends Empleado {
    private String departamiento;

    public Profesores(String nombre, String apellidos, int id, String estado_civil, int incorporacion, int despacho, String departamiento) {
        super(nombre, apellidos, id, estado_civil, incorporacion, despacho);
        this.departamiento = departamiento;
    }

    public String getDepartamiento() {
        return departamiento;
    }

    public void setDepartamiento(String departamiento) {
        this.departamiento = departamiento;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nProfesores{" + "departamiento=" + departamiento + '}';
    }
}
