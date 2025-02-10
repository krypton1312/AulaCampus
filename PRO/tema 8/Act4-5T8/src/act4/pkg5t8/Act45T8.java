package act4.pkg5t8;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Act45T8 {

    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/colegio", "root", "");
        Scanner sc = new Scanner(System.in);

        System.out.print("ID del alumno: ");
        int id = sc.nextInt();
        sc.nextLine();
        getAlumno(con, id);
        System.out.println("¿Qué desea hacer?");
        System.out.println("1. Eliminar alumno");
        System.out.println("2. Actualizar alumno");
        System.out.println("3. Salir");
        int opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1:
                deleteAlumno(con, id);
                break;
            case 2:
                System.out.print("Nuevo nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Nuevos apellidos: ");
                String apellidos = sc.nextLine();
                System.out.print("Nuevo curso: ");
                String curso = sc.nextLine();
                System.out.print("Nueva nota final: ");
                double notaFinal = sc.nextDouble();
                sc.nextLine();
                System.out.print("Nuevas observaciones: ");
                String observaciones = sc.nextLine();

                updateAlumno(con, id, nombre, apellidos, curso, notaFinal, observaciones);
                break;
            case 3:
                System.out.println("Operación cancelada.");
                break;
            default:
                System.out.println("Opción no válida.");
        }

    }

    public static void getAlumno(Connection con, int id) throws SQLException {
        PreparedStatement stat = con.prepareStatement("SELECT * FROM alumnos WHERE idAlumno = ?;");
        stat.setInt(1, id);
        ResultSet res = stat.executeQuery();
        do {
            if (res.next()) {
                int identAlumno = res.getInt("idAlumno");
                String nombre = res.getString("nombre");
                String apellidos = res.getString("apellidos");
                String curso = res.getString("curso");
                double notaFinal = res.getDouble("notaFinal");
                String observaciones = res.getString("observaciones");
                System.out.println(identAlumno + "\t" + nombre + "\t" + apellidos + "\t" + curso + "\t" + notaFinal + "\t" + observaciones);
            } else {
                System.out.println("Alumno no existe.");
            }
        } while (res.next());
    }

    public static void deleteAlumno(Connection con, int id) throws SQLException {
        PreparedStatement stat = con.prepareStatement("DELETE FROM alumnos WHERE idAlumno = ?;");
        stat.setInt(1, id);
        int result = stat.executeUpdate();
        if (result > 0) {
            System.out.println("Alumno ha sido eliminado");
        }
    }

    public static void updateAlumno(Connection con, int id, String nombre, String apellidos, String curso, double notaFinal, String observaciones) throws SQLException {

        String query = "UPDATE alumnos SET nombre = ?, apellidos = ?, curso = ?, notaFinal = ?, observaciones = ? WHERE idAlumno = ?;";

        PreparedStatement stat = con.prepareStatement(query);
        stat.setString(1, nombre);
        stat.setString(2, apellidos);
        stat.setString(3, curso);
        stat.setDouble(4, notaFinal);
        stat.setString(5, observaciones);
        stat.setInt(6, id);

        int result = stat.executeUpdate();
        if (result > 0) {
            System.out.println("Alumno actualizado correctamente.");
        } else {
            System.out.println("No se encontró el alumno con ID " + id);
        }

    }

}
