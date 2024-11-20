package ejemplofechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class EjemploFechas {
    public static void main(String[] args) {
        Date fecha = new Date(2020, 4 , 15);
        System.out.println(fecha.getTime());
        System.out.println(fecha );
        System.out.println("");
        
        // clase localDate, localTime, localDateTime
        
        LocalDate miFecha = LocalDate.now(); // fecha actual
        LocalDate miFecha1 = LocalDate.of(2020, 4, 15); // fecha 15/04/2020
        
        System.out.println(miFecha);
        
        // hora actual
        
        LocalTime miHora = LocalTime.now();
        LocalTime miHora1 = LocalTime.of(14, 53, 31); // Hora
        
        System.out.println(miHora1+ " ====== " +miHora);
        
        LocalDateTime miFechaHora =  LocalDateTime.now();
        LocalDateTime miFechaHora1 =  LocalDateTime.of(2020, 4, 15, 14, 53, 31); // fecha y hora
        
        System.out.println(miFechaHora1);
        
        // Introducir fecha por teclado
        // convertimos usando un patron a LocalDate
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce una fecha: ");
        String fechaT = s.nextLine();
        
        // creamos patron
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        // Convertimos .parse() el String fecha en LocalDate
        LocalDate fechaLD = LocalDate.parse(fechaT, formato);
        System.out.println(fechaLD);
        
        // Convertimos LocalDate en un String con el formato
        // que queramos.
        
        // Creamos patron de salida, ejemplo - lunes, 16 de mayo del 2010
        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("eeee', 'dd' de 'MMMM' del 'yyyy");
        
        // Creamos un String para conventir la fecha al formato creado .format();
        String fechaSalida = fechaLD.format(formato1);
        System.out.println(fechaSalida);
        
        // Comparar fecha
        LocalDate fechaEntrada1 = LocalDate.of(2000, 4, 18);
        LocalDate fechaEntrada2 = LocalDate.of(2001, 5, 19);
        boolean anterior = fechaEntrada1.isBefore(fechaEntrada2);
        System.out.println("Es anterior? " + anterior);
        
        // Tiempo en dias transcurrido entre dos fechas
        // con clase ChronoUnit con la cantidad de tiempo y
        // el metodo between();
        long dias = ChronoUnit.DAYS.between(fechaEntrada1, fechaEntrada2);
        System.out.println(dias);
    }
}
