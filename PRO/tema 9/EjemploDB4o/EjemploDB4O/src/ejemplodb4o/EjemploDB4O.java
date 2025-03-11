package ejemplodb4o;
//(1) copiar a la raiz del proyecto 
// el fichero .JAR

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Predicate;

// (2) Enlazamos la librería al proyecto
// del fichero JAR de la raiz del propio
// proyecto
public class EjemploDB4O {
    public static void main(String[] args) {
        // Creamos la conexion a la base de datos
        ObjectContainer base = 
            Db4oEmbedded.openFile("alumnos.db4o");
        // Insertamos un alumno
        insertar(base,"10389381", "Luis", "Ros",
            7.5, "Aprobado");
        // Insertamos un alumno
        insertar(base,"18474321", "Rosa", "Mas",
            9.5, "Aprobado con Matricula de Honor");
        // Listamos los objetos de la base de datos
        listar(base);
        System.out.println("-----------------------");
        // Consultamos el alumno con nia 18474321
        consultaNia(base, "18474321");
        // Cantidad de alumnos
        System.out.println("Numero Alumnos: "
            + numAlumnos(base));
        // Actualizamos la nota del alumno con nia 18474321
        actualizar(base, "18474321", "Rosa", "Mas", 
                10, "Aprueba con Matrícula de Honor");
        System.out.println("---------------------------");
        listar(base);
        
        // Eliminamos el alumno con nia 18474321
        eliminar(base, "10389381");
        System.out.println("---------------------------");
        listar(base);
        
        System.out.println("---------------------------");
        consultaNQ(base);
        
        // Cerramos la conexion a la base de datos
        base.close();
    }
    
    
    
    public static void insertar(ObjectContainer base,
        String nia, String nombre, String apellidos, 
        double nota, String observaciones){
        // Creamos el objeto miAlumno y lo insertamos
        // con el método .store()
        Alumno miAlumno =
            new Alumno(nia, nombre, apellidos, nota,
              observaciones);
        // Cerranos la base de datos
        base.store(miAlumno);
    }
    
    public static void listar(ObjectContainer base){
        // Creamos instancia de consulta con las
        // condiciones del objeto
        Alumno consulta = 
            new Alumno(null, null, null, 0, null);
        // Lanzamos la consulta y obtenemos en un 
        // ObjectSet los alumnos que cumplen la condicion
        ObjectSet resultado =
             base.queryByExample(consulta);
        // Recorremos el ObjectSet y mostramos 
        // los alumnos
        while(resultado.hasNext()){
            // Recuperamos del ObjectSet el alumno
            // y lo mostramos
            Alumno miAlumno = (Alumno)resultado.next();
            System.out.println(miAlumno);
        }     
    }

    
    public static void consultaNia(ObjectContainer base,
            String nia){
        // Creamos instancia de consulta con las
        // condiciones del objeto
        Alumno consulta = 
            new Alumno(nia, null, null, 0, null);
        // Lanzamos la consulta y obtenemos en un 
        // ObjectSet los alumnos que cumplen la condicion
        ObjectSet resultado =
             base.queryByExample(consulta);
        // Recorremos el ObjectSet y mostramos 
        // los alumnos
        while(resultado.hasNext()){
            // Recuperamos del ObjectSet el alumno
            // y lo mostramos
            Alumno miAlumno = (Alumno)resultado.next();
            System.out.println(miAlumno);
        }     
    }
    
    public static int numAlumnos(ObjectContainer base){
        // Creamos instancia de consulta con las
        // condiciones del objeto
        Alumno consulta = 
            new Alumno(null, null, null, 0, null);
        // Lanzamos la consulta y obtenemos en un 
        // ObjectSet los alumnos que cumplen la condicion
        ObjectSet resultado =
             base.queryByExample(consulta);
        // devolvemos el número de objetos del ObjectSet
        return resultado.size();
        
    }
    public static void actualizar(ObjectContainer base,
        String nia, String nombre, String apellidos, 
        double nota, String observaciones){
        // Creamos instancia de consulta con el nia
        Alumno consulta = new Alumno(nia, null, null, 0, null);
        // lanzamos consulta y obtenemos el objecto alumno que
        // cumple con el nia
        ObjectSet resultado = base.queryByExample(consulta);
        Alumno miAlumno=null;
        while(resultado.hasNext()){
            // Recuperamos el alumno con nia
            miAlumno = (Alumno)resultado.next();
            // Actualizamos los datos
            miAlumno.setNombre(nombre);
            miAlumno.setApellidos(apellidos);
            miAlumno.setNota(nota);
            miAlumno.setObservaciones(observaciones);
            // Almacena objeto con los datos actualizados
            base.store(miAlumno);
        }    
    }
    
    public static void eliminar(ObjectContainer base,
        String nia){
        // Creamos instancia de consulta con el nia
        Alumno consulta = new Alumno(nia, null, null, 0, null);
        // lanzamos consulta y obtenemos el objecto alumno que
        // cumple con el nia
        ObjectSet resultado = base.queryByExample(consulta);
        Alumno miAlumno=null;
        while(resultado.hasNext()){
            // Recuperamos el alumno con nia
            miAlumno = (Alumno)resultado.next();
            // Eliminamos el objeto alumno
            base.delete(miAlumno);
        }
    }
    
    private static void consultaNQ(ObjectContainer base){
        Predicate<Alumno> consulta = new Predicate<Alumno>(){
            @Override
            public boolean match(Alumno miAlumno) {
                return (miAlumno.getNota() > 5 && (miAlumno.getObservaciones().contains("Honor")));
            }
        };
        
        ObjectSet resultado = base.query(consulta);
        while (resultado.hasNext()) {
            Alumno alumno = (Alumno)resultado.next();
            System.out.println(alumno);
        }
    }
    
}
