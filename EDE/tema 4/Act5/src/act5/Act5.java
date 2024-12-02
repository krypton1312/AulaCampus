package act5;

import java.util.Scanner;

public class Act5 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre: ");
        String nombre = tec.nextLine();
        
        System.out.println("Introduce tu edad: ");
        int edad = tec.nextInt();
        tec.nextLine();
        
        System.out.println("Introduce tu altura: ");
        double altura = tec.nextDouble();
        tec.nextLine();
        
        System.out.println("Tu nombre es " + nombre);
        System.out.println("Tu edad es " + edad);
        System.out.println("Tu altura es " + altura);     
    }
}
