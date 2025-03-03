package ejercicio1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter("resultado.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        System.out.print("Introduce un numero entero: ");
        
        String hex = Integer.toHexString(sc.nextInt()).toUpperCase();
        System.out.println("El numero en hexadecimal: " + hex);
        sc.nextLine();
        bw.write(hex);
        bw.flush();
        bw.close();
        fw.close();
    }
    
}
