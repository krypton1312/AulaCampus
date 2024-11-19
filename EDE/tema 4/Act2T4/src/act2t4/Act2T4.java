package act2t4;

import java.util.Scanner;

public class Act2T4 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Introduce número 1: ");
        int num1 = tec.nextInt();
        tec.nextLine();

        System.out.print("Introduce número 2: ");
        int num2 = tec.nextInt();
        tec.nextLine();

        System.out.println("¿Que desea realizar? (1 = Sumar, 2 = Restar)");
        int opcion = tec.nextInt();
        tec.nextLine();

        int resultado = 0;
        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
        }
        System.out.println(resultado);
    }
}
