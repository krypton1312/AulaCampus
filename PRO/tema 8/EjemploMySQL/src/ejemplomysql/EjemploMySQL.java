package ejemplomysql;

import java.sql.*;

public class EjemploMySQL {
    public static void main(String[] args) throws SQLException {
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/videoclub", "root","");
        
        System.out.println("Conexion realizada");
        conexion.close();
        System.out.println("Conexion cerrada");
    }
}
