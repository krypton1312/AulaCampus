package ejercicio4;

import java.sql.*;

public class Ejercicio4 {

    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/television","root","");
        Statement stat = con.createStatement();
        ResultSet result = stat.executeQuery("SELECT * FROM programas WHERE nombrePrograma LIKE 'A%'");
        while(result.next()){
            int id = result.getInt("idPrograma");
            String nombre = result.getString("nombrePrograma");
            Date date = result.getDate("fechEmision");
            int espectadores = result.getInt("espectadores");
            System.out.println("idPrograma: " + id + "\tnombrePrograma: "  + nombre + "\tfechaEmision: " + date + "\tespectadores: "  + espectadores);
        }
    }    
}
