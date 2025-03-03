package act1t9;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.Scanner;

public class Act1T9 {
    public static void main(String[] args) {
        ObjectContainer base = Db4oEmbedded.openFile("empleados.db4o");
        Scanner sc = new Scanner(System.in);
        
        insertar(base, sc);
        consultarPorId(base, sc);
        listar(base);
        
        
        base.close();
    }
    
    public static void insertar(ObjectContainer base, Scanner sc){
        System.out.print("IdEmpleado: ");
        int idEmpleado = sc.nextInt();
        sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = sc.nextLine();
        System.out.print("Puesto: ");
        String puesto = sc.nextLine();
        System.out.print("Sucursal: ");
        String sucursal = sc.nextLine();
        System.out.print("Sueldo: ");
        double sueldo = sc.nextDouble();
        sc.nextLine();
        
        base.store(new Empleado(idEmpleado, nombre, apellidos, puesto, sucursal, sueldo));
    }
    
    public static void consultarPorId(ObjectContainer base, Scanner sc){
        System.out.print("El id del empleado:");
        ObjectSet resultado = base.queryByExample(new Empleado(sc.nextInt() , null, null, null, null, 0));
        sc.nextLine();
        while (resultado.hasNext()) {
            System.out.println("Empleado con este id: ");
            System.out.println((Empleado)resultado.next());
        }
    }
    
    public static void listar(ObjectContainer base){
        ObjectSet resultado = base.queryByExample(new Empleado(0, null, null, null, null, 0));
        while (resultado.hasNext()) {
            System.out.println((Empleado)resultado.next());
        }
    }
}
