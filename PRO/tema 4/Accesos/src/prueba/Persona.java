package accesos;
public class Persona {
    private int id;
    protected String nombre;
    public int edad;
    
    private void mostrarDatos(){
        System.out.println(id);
        System.out.println(nombre);
        System.out.println(edad);
    }
}
