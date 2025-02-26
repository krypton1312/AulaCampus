package ejercicio4;

import java.sql.*;

public class Ejercicio4 {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca","root","");
        
        Statement stat = con.createStatement();
        ResultSet result = stat.executeQuery("SELECT * from libros WHERE autor LIKE 'a&' AND precio > 30");
        
        while(result.next()){
            int idLibro = result.getInt("idLibro");
            String titulo = result.getString("titulo");
            String autor = result.getString("autor");
            String editorial = result.getString("editorial");
            double precio = result.getDouble("precio");
            
            System.out.println(idLibro + " " + titulo + " " + autor + " " + editorial + " " + precio);
        }
    }
}
