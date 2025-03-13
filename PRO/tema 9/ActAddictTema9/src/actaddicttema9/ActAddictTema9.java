package actaddicttema9;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Predicate;
import java.util.Scanner;

public class ActAddictTema9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ObjectContainer base = Db4oEmbedded.openFile("aeropuerto.db4o");
        insertar(base, sc);
        System.out.println("---------------------");
        eliminar(base, sc);
        System.out.println("---------------------");
        actualizar(base, sc);
        System.out.println("---------------------");
        listar(base);
        System.out.println("---------------------");
        consultarPorNumPas(base, 2);
        
        base.close();
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
        System.out.print("Fecha de salida: ");
        String fechaSalida = sc.nextLine();
        System.out.print("Hora de salida: ");
        String horaSalida = sc.nextLine();
        System.out.print("Numero de pasajeros: ");
        int numPas = sc.nextInt();
        sc.nextLine();
        base.store(new Vuelo(id, destino, fechaSalida, horaSalida, numPas));
        base.commit();
    }
    
    public static void consultarPorId(ObjectContainer base, Scanner sc) {
        System.out.print("Id del vuelo:");
        ObjectSet result = base.queryByExample(new Vuelo(sc.nextInt(), null, null, null, 0));
        sc.nextLine();
        while (result.hasNext()) {
            System.out.println(result.next());
        }
    }

    public static void consultarPorDestino(ObjectContainer base, Scanner sc) {
        System.out.print("Destino del vuelo:");
        ObjectSet result = base.queryByExample(new Vuelo(0, sc.nextLine(), null, null, 0));
        while (result.hasNext()) {
            System.out.println(result.next());
        }
    }
    
    public static void eliminar(ObjectContainer base, Scanner sc) {
        System.out.print("Id del vuelo:");
        ObjectSet result = base.queryByExample(new Vuelo(sc.nextInt(), null, null, null, 0));
        sc.nextLine();
        while (result.hasNext()) {
            Vuelo vuelo = (Vuelo)result.next();
            System.out.println(vuelo + " - Ha sido eliminado");
            base.delete(vuelo);
        }
    }
    
    public static void actualizar(ObjectContainer base, Scanner sc){
        System.out.print("Id del vuelo:");
        ObjectSet result = base.queryByExample(new Vuelo(sc.nextInt(), null, null, null, 0));
        sc.nextLine();
        while (result.hasNext()) {
            Vuelo vuelo = (Vuelo)result.next();
            System.out.println(vuelo);
            System.out.print("Que dato deseas actualizar? ");
            switch (sc.nextLine()) {
                case "Destino":
                    System.out.print("Nuevo destino:");
                    vuelo.setDestino(sc.nextLine());
                    break;
                case "FechaSalida":
                    System.out.print("Nuevo fecha de salida:");
                    vuelo.setFechaSalida(sc.nextLine());
                    break;
                case "HoraSalida":
                    System.out.print("Nueva hora de salida:");
                    vuelo.setHoraSalida(sc.nextLine());
                    break;
                case "NumPas":
                    System.out.print("Nuevo numero de pasajeros:");
                    vuelo.setNumPasajeros(sc.nextInt());
                    sc.nextLine();
                    break;
                default:
                    System.out.println("El dato introducido esta mal");
                    return;
            }
            System.out.println("Actializacion fue exitoso");
        }
    }
    
    public static void consultarPorNumPas(ObjectContainer base, int numPas){
        Predicate<Vuelo> consulta = new Predicate<Vuelo>(){
            @Override
            public boolean match(Vuelo et) {
                return (et.getNumPasajeros() > numPas);
            }
        };
        
        ObjectSet result = base.query(consulta);
        while(result.hasNext()){
            System.out.println(result.next());
        }
    }
}
