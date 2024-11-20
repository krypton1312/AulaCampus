package act11t5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Act11T5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        System.out.print("Introduce una fecha: ");
        
        LocalDate fechaUser = LocalDate.parse(s.nextLine(), formato);
        LocalDate fechaActual = LocalDate.now();
        
        if(fechaUser.isAfter(fechaActual)){
            System.out.println("Es una fecha futura");
        }
        else if(fechaUser.isBefore(fechaActual)){
            System.out.println("Es una fecha pasada");
        }
        else if(fechaUser.isEqual(fechaActual)){
            System.out.println("Es una fecha actual");
        }
    }
}
