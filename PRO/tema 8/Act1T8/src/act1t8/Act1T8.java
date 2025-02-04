package act1t8;

import java.sql.*;
import java.util.Scanner;

public class Act1T8 {

    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/colegio", "root", "");
        System.out.println("Conexion realizada.");
        Statement stat = con.createStatement();

        getTableDescibe(stat);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Id alumno: ");
        int idAlumno = sc.nextInt();
        sc.nextLine();
        getStudentById(idAlumno, stat);
        
        getAllStudents(stat);
        
        con.close();
        System.out.println("Conexion cerrada.");
    }
    public static void getTableDescibe(Statement stat) throws SQLException{
        ResultSet describe = stat.executeQuery("DESCRIBE alumnos");
        while (describe.next()) {
            System.out.println("Campo: " + describe.getString("Field")
                    + ", Tipo: " + describe.getString("Type"));
        }
        System.out.println("========================");
    }
    
    public static void getStudentById(int idAlumno, Statement stat) throws SQLException{
        ResultSet registros = stat.executeQuery("SELECT * FROM alumnos WHERE idAlumno =" + idAlumno);
        
        if(registros.next()){
            do{
                int identAlumno = registros.getInt("idAlumno");
                String nombre = registros.getString("nombre");
                String apellidos = registros.getString("apellidos"); 
                String curso = registros.getString("curso"); 
                double notaFinal = registros.getDouble("notaFinal");
                String observaciones = registros.getString("observaciones");
                System.out.println(identAlumno + "\t" + nombre + "\t" + apellidos + "\t" + curso + "\t" + notaFinal + "\t" + observaciones);
            }while(registros.next());
        }else{
            System.out.println("====================");
            System.out.println("Alumno no existe.");
            System.out.println("====================");
        }
    }
    
    public static void getAllStudents(Statement stat) throws SQLException{
        ResultSet registros = stat.executeQuery("SELECT * FROM alumnos");
        
        if(registros.next()){
            do{
                int identAlumno = registros.getInt("idAlumno");
                String nombre = registros.getString("nombre");
                String apellidos = registros.getString("apellidos"); 
                String curso = registros.getString("curso"); 
                double notaFinal = registros.getDouble("notaFinal");
                String observaciones = registros.getString("observaciones");
                System.out.println(identAlumno + "\t" + nombre + "\t" + apellidos + "\t" + curso + "\t" + notaFinal + "\t" + observaciones);
            }while(registros.next());
        }else{
            System.out.println("====================");
            System.out.println("La tabla esta vacia.");
            System.out.println("====================");
        }
    }
}
