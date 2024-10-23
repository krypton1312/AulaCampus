package prueba;
public class Persona {
    private int id;
    protected String nombre;
    public int edad;

    public Persona() {
    }
    
    
    public void miAccesso(){
       Persona miPersona = new Persona();
        System.out.println(miPersona.id);
        System.out.println(miPersona.nombre);
        System.out.println(miPersona.edad);
    }
    
    
}
