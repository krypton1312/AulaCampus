package ejercicio1ext4b;

import java.util.Scanner;

public class Ejercicio1ExT4B {
    public static void main(String[] args) {
        //Gastar el mínimo número de variables.
        //Evitar repetir código.
        //Intentar gastar la mejor estructura posible. 
        //Nombres de variables descriptivos. 
        //Hacer solo las operaciones necesarias.
        //Usar tipos primitivos.

        Scanner teclado = new Scanner(System.in);
                     
        System.out.print("Introduce Importe: ");
        double importe = teclado.nextDouble();
        teclado.nextLine();
        
        System.out.print("Mostrar calculo (1=IVA 2=DTO): ");

        switch (teclado.nextLine()) {
            case "1":
                System.out.println("El importe final es: "+ importe * 1.21);
                break;
            case "2":
                System.out.println("El importe final es: "+ importe * 1.10);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }    
}
