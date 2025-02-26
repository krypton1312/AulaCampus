package ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("numeros.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        
        String linea = "";
        while((linea = br.readLine()) != null){
            System.out.println("Numero leido: " + linea);
            System.out.println("El numero en octal: " + Integer.toOctalString(Integer.parseInt(linea)));
        }
        
        br.close();
        fr.close();
    }
}
