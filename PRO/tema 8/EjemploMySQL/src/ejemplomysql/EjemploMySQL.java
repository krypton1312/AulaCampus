package ejemplomysql;

import java.sql.*;
import java.util.Scanner;

public class EjemploMySQL {
    public static void main(String[] args) throws SQLException {
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/videoclub", "root","");    
        System.out.println("Conexion realizada");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Codigo pelicula: ");
        Statement sentencia = conexion.createStatement();
        int codpelicula = sc.nextInt();
        sc.nextLine();
        ResultSet registros = sentencia.executeQuery("SELECT * FROM peliculas WHERE codpelicula =" + codpelicula);
        if(registros.next()){
            while(registros.next()){
                String titulo = registros.getString("titulo");
                String tema = registros.getString("tema");
                int duracion = registros.getInt("duracion");
                double precio = registros.getDouble("precio");
                System.out.print(titulo+"\t"+ tema+"\t"+duracion+"\t"+precio);
            }
        }else{
            System.out.println("====================");
            System.out.println("Pelicula no existe.");
            System.out.println("====================");
        }
        conexion.close();
        System.out.println("Conexion cerrada");
    }
}
