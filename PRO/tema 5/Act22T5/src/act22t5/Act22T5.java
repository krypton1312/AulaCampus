package act22t5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Act22T5 {

    public static void main(String[] args) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String[] fechasAlta = {
            "12/05/1975", "23/08/1983", "17/11/1995", "04/02/2001",
            "19/03/1979", "09/07/1988", "30/12/1999", "15/04/2005",
            "11/06/1981", "28/09/1993", "05/01/2020", "18/10/1985",
            "27/03/1976", "08/12/2010", "21/07/1997", "06/11/1982",
            "03/03/1970", "14/02/1990", "25/05/2003", "10/10/1987"
        };

        for (int i = 0; i < fechasAlta.length; i++) {
            LocalDate fecha = LocalDate.parse(fechasAlta[i], format);
            String retencion;

            if (fecha.isBefore(LocalDate.of(1980, 1, 1))) {
                retencion = "20%";
            } else if (!fecha.isBefore(LocalDate.of(1980, 1, 1)) && fecha.isBefore(LocalDate.of(2000, 1, 1))) {
                retencion = "15%";
            } else {
                retencion = "5%";
            }

            System.out.println("Empleado[" + (i + 1) + "] = " + retencion);
        }
    }
}
