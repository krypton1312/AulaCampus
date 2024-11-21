package ejemplofechas1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class EjemploFechas1 {
    public static void main(String[] args) {
        LocalDate miFecha = LocalDate.of(2020, 10, 23);
        LocalDate miFecha2 = miFecha.withYear(2023);
        
        System.out.println(miFecha);
        System.out.println(miFecha2);
        System.out.println(miFecha.getYear());
        
        LocalDate fecha3 = miFecha2.plus(20, ChronoUnit.DAYS)
                                   .plus(40, ChronoUnit.MONTHS)
                                   .minus(10, ChronoUnit.YEARS);
        System.out.println(fecha3);
        if(fecha3.getDayOfWeek().equals(DayOfWeek.SUNDAY)){
            System.out.println("sunday");
        }else{
            System.out.println("not sunday");
        }
        System.out.println("dia de la semana: " + miFecha.getDayOfWeek());
    }
}
