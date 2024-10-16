package practica3;
import java.util.Scanner;

public class Practica3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona pers1 = new Persona();
        System.out.println();
        pers1.pedirTodosDatos(sc);
        Persona pers2 = new Persona();
        System.out.println();
        pers2.pedirTodosDatos(sc);
        Persona pers3 = new Persona();
        System.out.println();
        pers3.pedirTodosDatos(sc);
        
        System.out.println();
        pers1.mostrarDatos();
        System.out.println(pers1.getNombre() + " es mayor de edad: " + pers1.esMayorDeEdad()+"\n");
        pers2.mostrarDatos();
        System.out.println(pers2.getNombre() + " es mayor de edad: " + pers2.esMayorDeEdad()+"\n");
        pers3.mostrarDatos();
        System.out.println(pers3.getNombre() + " es mayor de edad: " + pers3.esMayorDeEdad()+"\n");
        
        System.out.println(pers1.calcularMC());
    }

}
