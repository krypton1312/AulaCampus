package act1t9;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Predicate;
import java.util.Scanner;

public class Act1T9 {
    public static void main(String[] args) {
        ObjectContainer base = Db4oEmbedded.openFile("empleados.db4o");
        Scanner sc = new Scanner(System.in);
        
        //insertar(base, sc);
        //consultarPorId(base, sc);
        listar(base);
        
        //eliminar(base, sc);
        
        //actualizar(base, sc);
        consultaNQ(base,sc);
        
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
    
    public static void eliminar(ObjectContainer base, Scanner sc){
        System.out.println("Id del empleado para eliminar: ");
        ObjectSet resultado = base.queryByExample(new Empleado(sc.nextInt() , null, null, null, null, 0));
        while(resultado.hasNext()){
            Empleado emp = (Empleado)resultado.next();
            System.out.println("Ha sido eliminado:\n" + emp);
            base.delete(emp);
        }
    }
    public static void actualizar(ObjectContainer base, Scanner sc){
        System.out.println("Id del empleado para actualizar: ");
        int id = sc.nextInt();
        sc.nextLine();
        ObjectSet resultado = base.queryByExample(new Empleado(id, null, null, null, null, 0)); 
        
        Empleado emp = null;
        while(resultado.hasNext()){
            emp = (Empleado)resultado.next();
            System.out.print("Nombre: ");
            emp.setNombre(sc.nextLine());
            System.out.print("Apellidos: ");
            emp.setApellidos(sc.nextLine());
            System.out.print("Puesto: ");
            emp.setPuesto(sc.nextLine());
            System.out.print("Sucursal: ");
            emp.setSucursal(sc.nextLine());
            System.out.print("Sueldo: ");
            emp.setSueldo(sc.nextDouble());
            sc.nextLine();
            base.store(emp);
        }
        System.out.println("actualizado:" + emp);
    } 
    
    public static void consultaNQ(ObjectContainer base, Scanner sc){
        System.out.println("Sucursal: ");
        String sucursal = sc.nextLine();
        System.out.println("Sueldo: ");
        double sueldo = sc.nextDouble();
        sc.nextLine();
        Predicate<Empleado> consulta = new Predicate<Empleado>(){
            @Override
            public boolean match(Empleado et) {
                return et.getSucursal().equals(sucursal) && et.getSueldo() > sueldo;
            }
        };
        ObjectSet resultado = base.query(consulta);
        while(resultado.hasNext()){
            System.out.println((Empleado)resultado.next());
        }
    }
}
