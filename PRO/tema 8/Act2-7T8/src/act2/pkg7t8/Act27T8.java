package act2.pkg7t8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Act27T8 {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/colegio", "root", "");
        Scanner sc = new Scanner(System.in);
        System.out.println("IdAlumno:");
        int idAlumno = sc.nextInt();
        sc.nextLine();
        System.out.print("Nombre:");
        String nombre = sc.nextLine();
        System.out.print("Apellidos:");
        String apellidos = sc.nextLine();
        System.out.print("Curso:");
        String curso = sc.nextLine();
        System.out.print("Nota final:");
        double notaFinal = sc.nextDouble();
        System.out.print("Observaciones:");
        String observaciones = sc.nextLine();
        
        insertarAlumno(con, idAlumno,nombre, apellidos, curso, notaFinal, observaciones);
        
        buscarAlumnos(con, notaFinal, curso);
        con.close();
    }
    public static void insertarAlumno(Connection con, int idAlumno,String nombre, String apellidos, String curso, double notaFinal, String observaciones) throws SQLException{
        PreparedStatement stat = con.prepareStatement("INSERT INTO alumnos(idAlumno,nombre,apellidos,curso,notaFinal, observaciones) VALUES(?,?,?,?,?,?)");
        stat.setInt(1, idAlumno);
        stat.setString(2,nombre);
        stat.setString(3,apellidos);
        stat.setString(4,curso);
        stat.setDouble(5,notaFinal);
        stat.setString(6,observaciones);
        int result = stat.executeUpdate();
        if(result > 0){
            System.out.println("Alumno insertado.");
        }else{
            System.out.println("Error");
        }
    }
    public static void buscarAlumnos(Connection con, double notaFinal, String curso) throws SQLException{
        PreparedStatement stat = con.prepareStatement("SELECT * FROM alumnos WHERE ? <= notaFinal AND curso LIKE ?");
        stat.setDouble(1, notaFinal);
        stat.setString(2, curso);
        ResultSet rs = stat.executeQuery();
        while(rs.next()){
            System.out.println(rs.getInt("idAlumno") + " " + rs.getString("nombre") + " " + rs.getString("curso") + " " + rs.getDouble("notaFinal") + " " + rs.getString("observaciones"));
        }
    }
}
