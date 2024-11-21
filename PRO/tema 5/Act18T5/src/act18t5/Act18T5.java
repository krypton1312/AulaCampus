package act18t5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Act18T5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaT;
        double pago = 0;
        while(true){
            System.out.print("Introduce fecha en formato dd/MM/yyyy: ");
            fechaT = s.nextLine();
            
            if(fechaT.equals("0")){
                break;
            }
            
           try {
                LocalDate fecha = LocalDate.parse(fechaT, format);
                System.out.print("Introduce horas trabajadas este día: ");
                double horas = s.nextDouble();
                s.nextLine();

                if (fecha.getDayOfWeek().equals(DayOfWeek.SATURDAY) || fecha.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
                    pago += horas * 20;
                } else {
                    pago += horas * 15; 
                }
            } catch (Exception e) {
                System.out.println("Error.");
            }
        }
        System.out.println("Cantidad de dinero que hay que pagar al empleado es: " + pago);
    }
}
