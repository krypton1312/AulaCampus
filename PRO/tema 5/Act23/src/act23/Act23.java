package act23;
import objetos.*;
public class Act23 {
    public static void main(String[] args) {
        Persona[] personas = {
            new Estudiante("Juan", "Pérez Gómez", 12345, "Soltero", "Matemáticas"), 
            new Profesores("Ana", "López Martínez", 54321, "Casada", 2015, 101, "Física"),
            new PersonalServicio("Carlos", "Ramírez Torres", 67890, "Divorciado", 2018, 205, "Biblioteca")
        }; 
        
        personas[0].setEstado_civil("Casado");
        ((Empleado)personas[1]).setDespacho(55);
        ((Estudiante)personas[0]).setCurso("Medioambiente");
        ((Profesores)personas[1]).setDepartamiento("Un nuevo departamiento");
        ((PersonalServicio)personas[2]).setSeccion("sec1");
        
        for (Persona persona : personas) {
            System.out.println(persona.toString() + "\n");
        }
    }
}
