package ejercicio3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Espectador> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        list.add(new Espectador(123,321,LocalDate.of(2022, 12, 13), LocalTime.of(22, 15), "titulo"));
        
        ponerEnCola(sc, list);
        atender(list, sc);
        listar(list);
    }
    public static void ponerEnCola(Scanner sc,ArrayList<Espectador>  list){
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm");
        System.out.print("Fila: ");
        int fila = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Asiento: ");
        int asiento = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Fecha: ");
        String fechaT = sc.nextLine();
        LocalDate fecha = LocalDate.parse(fechaT, formatDate);
        
        System.out.print("Hora: ");
        String horaT = sc.nextLine();
        LocalTime hora = LocalTime.parse(horaT, formatTime);
        
        System.out.print("Titulo de la pelicula: ");
        String titulo = sc.nextLine();
        
        list.add(new Espectador(fila, asiento, fecha, hora, titulo));
    }
    public static void atender(ArrayList<Espectador> list, Scanner sc){
        listar(list);
        System.out.println("Introduce quien quieres atender: ");
        int pos = sc.nextInt();
        sc.nextLine();
        if(pos < list.size() && pos > 0){
            System.out.println("Espectador ha sido atendido: " + list.remove(pos-1));
        }else{
            System.out.println("La posicion es incorrecta");
        }    
    }
    public static void listar(ArrayList<Espectador> list){
        System.out.println("Cola de escpectadores: ");
        for(int i = 0;i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
