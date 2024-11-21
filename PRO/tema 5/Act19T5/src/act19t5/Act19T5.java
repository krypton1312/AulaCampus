package act19t5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Act19T5 {
    public static void main(String[] args) {
        LocalDate fechaInicial = LocalDate.of(2023, 4 , 15);
        LocalDate fechaFinal = LocalDate.of(2023, 5 , 19);
        
        double sueldo = ChronoUnit.DAYS.between(fechaInicial, fechaFinal) * 55 * 1.12;
        System.out.println(sueldo);
    }
}
