package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Intoduce que tipo de vehicule quiere asegurar.");
        System.out.print("(1 - coche, 2 - moto, 3 - camion): ");
        
        int tipo = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Introduce su edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("El precio es:" + precioFinal(tipo, edad));
        
    }   
    
    public static double precioFinal(int tipo, int edad){
        double precio;
        switch(tipo){
            case 1:
                precio = 450;
                break;
            case 2:
                precio = 150;
                break;
            case 3:
                precio = 1400;
                break;
            default:
                precio = 0;
                break;
        }
        
        if(edad >= 18 || edad <= 25){
            return precio * 1.5;
        }else if(edad >= 26 || edad <= 35){
            return precio * 1.25;
        }
        else if(edad >= 35){
            return precio;
        }else{
            return 0;
        }
    } 
}
