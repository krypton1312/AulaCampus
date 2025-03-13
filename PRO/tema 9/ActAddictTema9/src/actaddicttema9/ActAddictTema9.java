package actaddicttema9;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ActAddictTema9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ObjectContainer base = Db4oEmbedded.openFile("aeropuerto.db4o");
        insertar(base, sc);
        listar(base);
    }
    public static void listar(ObjectContainer base){
       ObjectSet result = base.queryByExample(new Vuelo(0, null, null, null, 0));
       while(result.hasNext()){
           System.out.println(result.next());
       }
    }
    public static void insertar(ObjectContainer base, Scanner sc){
        System.out.print("IdVuelo: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Destino: ");
        String destino = sc.nextLine();
        System.out.print("Fecha de salida(Ej. 05/03/2024): ");
        String fechaSalida = sc.nextLine();
        System.out.print("Hora de salida(Ej. 20:30): ");
        String horaSalida = sc.nextLine();
        System.out.print("Numero de pasajeros: ");
        int numPas = sc.nextInt();
        sc.nextLine();
        base.store(new Vuelo(id, destino, fechaSalida, horaSalida, numPas));
        base.commit();
    }
}
