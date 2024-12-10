package act4t6;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Act4T6 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre de alumno: ");
        FileWriter fw = new FileWriter(sc.nextLine() + ".txt");
        
        System.out.print("Datos del alumno: ");
        fw.write(sc.nextLine());
        
        fw.flush();
        fw.close();
    }
}
