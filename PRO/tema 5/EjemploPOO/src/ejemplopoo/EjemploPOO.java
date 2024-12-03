package ejemplopoo;
import objetos.*;
public class EjemploPOO {
    public static void main(String[] args) {     
        Persona[] misPersonas = new Persona[3];
        
        misPersonas[0] = new Empleado(150.5 , "Luis", "Ros");
        misPersonas[1] = new Empleado(234.5 , "Roma", "David");
        misPersonas[2] = new Empleado(425.5 , "Rosa", "Backham");
        
        System.out.println("Sueldo Luis: " + ((Empleado)misPersonas[0]).calculaSueldoFinal(150, 30));
        System.out.println("Sueldo Luis sin retencion: " + ((Empleado)misPersonas[0]).calculaSueldoFinal(150));   
    }
}
