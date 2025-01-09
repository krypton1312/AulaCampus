package act13t6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Act13T6 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fichero que copiamos: ");
        String name = sc.nextLine();
        File file1 = new File(name);
        
        System.out.println("Nuevo fichero: ");
        String newFile = sc.nextLine();
        File fileCopied = new File(newFile);
        // String nombre = name.substring(0,name.lastIndexOf("."));
        // File fileCopied = new File(nombre + "Copied.txt");
        BufferedReader br = new BufferedReader(new FileReader(file1));
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileCopied));
        String linea = "";
        while ((linea = br.readLine()) != null) {            
            bw.write(linea);
            bw.newLine();
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
