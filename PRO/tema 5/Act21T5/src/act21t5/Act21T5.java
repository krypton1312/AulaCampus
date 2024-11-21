package act21t5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Act21T5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        System.out.print("Introduce fecha en formato dd/MM/yyyy: ");
        LocalDate fechaEntrega = LocalDate.parse(s.nextLine(), format);
        LocalDate fechaActual = LocalDate.now();
        
        if(fechaEntrega.isAfter(fechaActual)){
            System.out.println("La fecha de entrega esta fuera de plazo.");
        }else{
            System.out.println("La fecha de entrega esta dentro de plazo.");
        }
    }
}
