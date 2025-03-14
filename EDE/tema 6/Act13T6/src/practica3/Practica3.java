package practica3;
import java.util.Scanner;

public class Practica3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona[] personas = new Persona[3];

        for (int i = 0; i < personas.length; i++) {
            personas[i] = new Persona();
            System.out.println();
            personas[i].pedirTodosDatos(sc);
        }
        for (int i = 0; i < personas.length; i++) {
            personas[i].mostrarDatos();
        }

        System.out.println(personas[0].calcularMC());
    }

}
