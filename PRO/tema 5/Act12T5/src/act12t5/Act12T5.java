package act12t5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Act12T5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        System.out.print("Introduce fecha de un empleado: ");
        LocalDate fechaNacim = LocalDate.parse(s.nextLine(), format);
        LocalDate fechaActual = LocalDate.now();
        
        long anyos = ChronoUnit.YEARS.between(fechaNacim, fechaActual);
        System.out.println("Empleado tiene " + anyos + " años.");
    }
}
