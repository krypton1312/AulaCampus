package act25t5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Act25T5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fecha = sc.nextLine();
        LocalDate fecha1 = LocalDate.parse(fecha, format);
        LocalDate fechaActual = LocalDate.now();
        if(ChronoUnit.YEARS.between(fecha1, fechaActual) >= 18){
            System.out.println("Mayor de edad.");
        }else{
            System.out.println("Menor de edad.");
        }
    }
}
