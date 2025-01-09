package act12t6;

import java.io.File;
import java.text.DecimalFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Act12T6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce nombre del fichero: ");
        String nombre = sc.nextLine();
        
        File fichero = new File(nombre);
        
        System.out.println("===================");
        System.out.println("Existe:" + fichero.exists());
        
        System.out.println(fichero.isFile() ? "Es un fichero" : "Es un directorio");
        long miliseg = fichero.lastModified();
        Instant tiempo = Instant.ofEpochMilli(miliseg);
        LocalDateTime fecha = tiempo.atZone(ZoneId.systemDefault()).toLocalDateTime();
        String textoFecha = fecha.format(DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss"));
        System.out.println("La ultima fecha de modificacion: " + textoFecha);
        
        DecimalFormat formato = new DecimalFormat("#,##0");
        System.out.println("El tamaño del archvo en bytes " + formato.format(fichero.length()));
    }
}
