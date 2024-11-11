package cocheej27;
import objetos.*;
import java.util.Scanner;

public class CocheEj27 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce la matrícula del coche: ");
        String matricula = s.next();

        System.out.print("¿El coche es automático? (true/false): ");
        boolean isAutomatico = s.nextBoolean();

        Coche coche;

        if (isAutomatico) {
            coche = new CocheCambioAutomatico(matricula);
        } else {
            coche = new CocheCambioManual(matricula);
        }

        coche.acelerar(60);

        if (coche instanceof CocheCambioManual) {
            ((CocheCambioManual) coche).cambiaMarcha(3);
        }

        System.out.println(coche.toString());

        s.close();
    }
}
