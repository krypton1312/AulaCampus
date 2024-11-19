package act6t4;

import java.util.Scanner;

public class Act6T4 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double resultado = 0;
        int opcion;
        do {
            System.out.println("************Menú principal************");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            
            System.out.print("Seleccione una opción: ");
            opcion = tec.nextInt();
            tec.nextLine();
            
            if(opcion == 5){
                break;
            }
            System.out.print("Introduce número 1: ");
            int num1 = tec.nextInt();
            tec.nextLine();
            
            System.out.print("Introduce número 2: ");
            int num2 = tec.nextInt();
            tec.nextLine();
            
            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    break;
                case 2:
                    resultado = num1 + num2;
                    break;
                case 3:
                    resultado = num1 + num2;
                    break;
                case 4:
                    resultado = num1 + num2;
                    break;
                case 5:
                    break;
            }
            System.out.println("El resultado es " + resultado);
        } while (opcion != 5);
    }
}
