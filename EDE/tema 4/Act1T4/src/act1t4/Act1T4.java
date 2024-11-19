package act1t4;

import java.util.Scanner;

public class Act1T4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Intoduce categoria laboral?");
        int catLaboral = scanner.nextInt();
        scanner.nextLine();

        System.out.println("¿Introduce sueldo?");
        double sueldo = scanner.nextDouble();
        scanner.nextLine();

        double resultado = 0;

        switch (catLaboral) {
            case 1:
                resultado = sueldo * 0.10;
                break;
            case 2:
                resultado = sueldo * 0.10;
                break;
            case 3:
                resultado = sueldo * 0.10;
                break;
            case 4:
                resultado = sueldo * 0.10;
                break;
            case 5:
                resultado = sueldo * 0.10;
                break;
            default:
                break;
        }
        System.out.println("La retención es " + resultado);
    }
}
