package act5t6;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Act5T6 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter("alumnos.txt", true);
        
        System.out.print("Nombre del alumno:");
        fw.write(sc.nextLine() + "\n");
        fw.flush();
        fw.close();
    }
}
