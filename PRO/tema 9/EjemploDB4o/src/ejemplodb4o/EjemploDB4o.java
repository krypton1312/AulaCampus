package ejemplodb4o;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class EjemploDB4o {
    public static void main(String[] args) {
        ObjectContainer base = Db4oEmbedded.openFile("alumnos.db4o");
        
        /*insertar(base, "123", "nombre1", "apellidos1", 55.5, "a lo mejor aprobado");
        insertar(base, "23490324", "DON CAPULLO", "notieneapellido", 3.5, "no sabe nada, suspendido");
        insertar(base, "346534", "Luis", "JoseDAUN", 7.5, "bien, aprobado"); */
        listar(base);
        System.out.println("");
        consultaNia(base, "123");
        System.out.println("");
        System.out.println(numAlumnos(base));
        base.close();
    }

    public static void insertar(ObjectContainer base, String nia, String nombre, String apellidos, double nota, String observaciones) {
        Alumno miAlumno = new Alumno(nia, nombre, apellidos, nota, observaciones);
        base.store(miAlumno);
    }
    public static void listar(ObjectContainer base){
        Alumno consulta = new Alumno(null, null, null, 0, null);
        ObjectSet resultado = base.queryByExample(consulta);
        while(resultado.hasNext()){
            Alumno miAlumno = (Alumno)resultado.next();
            System.out.println(miAlumno);
        }
    }
    
    public static void consultaNia(ObjectContainer base, String nia){
        Alumno consulta = new Alumno(nia, null, null, 0, null);
        ObjectSet resultado = base.queryByExample(consulta);
        while(resultado.hasNext()){
            Alumno miAlumno = (Alumno)resultado.next();
            System.out.println(miAlumno);
        }
    }
    
    public static int numAlumnos(ObjectContainer base){
        Alumno consulta = new Alumno(null, null, null, 0, null);
        ObjectSet resultado = base.queryByExample(consulta);
        return resultado.size();
    }
}
