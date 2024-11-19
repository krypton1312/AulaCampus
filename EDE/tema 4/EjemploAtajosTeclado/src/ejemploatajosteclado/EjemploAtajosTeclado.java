package ejemploatajosteclado;
import java.util.Scanner;

public class EjemploAtajosTeclado {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double numero;
        System.out.println("Intoduce un numero: ");
        numero = s.nextDouble();
        System.out.println("El numero es: " + numero);
    }
}
