package act11t6;

import java.io.*;
import java.util.Scanner;

public class Act11T6 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del archivo (por ejemplo, texto.txt): ");
        String nombreArchivo = scanner.nextLine();

        System.out.print("Ingrese la palabra a buscar: ");
        String palabra = scanner.nextLine();

        int contador = 0;

        BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
        String linea;

        while ((linea = br.readLine()) != null) {
            linea = linea.toLowerCase();
            String palabraMin = palabra.toLowerCase();

            int index = 0;
            while ((index = linea.indexOf(palabraMin, index)) != -1) {
                contador++;
                index += palabraMin.length();
            }
        }

        System.out.println("La palabra \"" + palabra + "\" aparece " + contador + " vez/veces.");
    }
}
