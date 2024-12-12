package ejemploescrituralineas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EjemploEscrituraLineas {
    private int lol;
    public static void main(String[] args) throws IOException {
        File miFichero = new File("fichero.txt");
        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter(miFichero, true);
        BufferedWriter bw = new BufferedWriter(fw);
        
        System.out.println("Texto: ");
        String texto = sc.nextLine();
        bw.write(texto);
        bw.newLine();
        
        bw.flush();
        
        bw.close();
        fw.close();
    }
}
