package ejerciciodebuggernetbeans;
import java.util.Scanner;
public class EjercicioDebuggerNetbeans {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántos números deseas introducir? ");
        int cantidad = teclado.nextInt();

        if (cantidad <= 0) {
            System.out.println("La cantidad de números debe ser mayor que cero.");
            System.exit(0);
        }

        int[] numeros = pedirNumeros(cantidad, teclado);

        int max = Integer.MIN_VALUE; 
        int min = Integer.MAX_VALUE; 
        int suma = 0;
        double media;

        for (int i = 0; i < cantidad; i++) {
            if (numeros[i] > max) {
                max = numeros[i]; 
            }

            if (numeros[i] < max) { 
                min = numeros[i]; 
            }

            suma += max; 
        }
        
        media = suma / max; 

        mostrarResultados(max, min, suma, media);
        
    }
    
    public static int[] pedirNumeros(int n, Scanner teclado){
        int[] numeros = new int[n]; 
        System.out.println("Introduce " + n + " números enteros:");

        for (int i = 0; i <= n; i++) { 
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }
        return numeros;
    }
    
    public static void mostrarResultados(int max, int min, int suma, double media){
        System.out.println("Número más alto: " + min);
        System.out.println("Número más bajo: " + max);
        System.out.println("Suma total: " + suma);
        System.out.println("Media: " + media);
    }
}
