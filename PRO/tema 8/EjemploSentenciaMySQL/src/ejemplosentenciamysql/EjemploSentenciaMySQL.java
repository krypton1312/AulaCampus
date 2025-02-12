package ejemplosentenciamysql;
// (1) Incluir biblioteca Mysql
// (2) importar java.sql.*

import java.sql.*;

public class EjemploSentenciaMySQL {

    public static void main(String[] args) throws SQLException {
        // (3) Creamos la conexion
        Connection conexion
                = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/videoclub",
                        "root", "");
        // Numero de registros
        //System.out.println("Numero Registros: " + numRegistros(conexion));
        // Ejecutamos listar
        //listar(conexion);
        // Consultamos pelicula 115
        //consultaPelicula(conexion, 115);
        
        // insertamos una pelicula
        //Pelicula miPelicula = new Pelicula(7000, "Superman",
        //    "Aventuras", 159, 3.2);
        //insertarPelicula(conexion, miPelicula);
        
        // Actualizar pelicula 7000 con nuevos datos
        //Pelicula miPelicula = new Pelicula(7000, "Spiderman",
        //        "Acción", 134, 5.4);
        //actualizarPelicula(conexion, miPelicula);
        
        // Eliminar pelicula 100
        int codPelicula=100;
        eliminarPelicula(conexion, codPelicula);
        
        // (4) Cerramos la conexion
        conexion.close();
    }

    public static void listar(Connection conexion) throws SQLException {
        // Creamos la instancia de sentencia
        // con el método .createStatement() de
        // la clase Statement
        Statement sentencia
                = conexion.createStatement();
        // Volcamos en un ResultSet (conjunto de registros)
        // el resultado de la ejecución de la consulta.
        // Para ejecutar la consulta utilizamos .executeQuery()
        ResultSet registros
                = sentencia.executeQuery("SELECT * FROM peliculas");
        // Recorremos el conjunto de registros con un bucle.
        // .next() obtiene el siguiente registro o false si
        // no hay más registros.
        while (registros.next()) {
            // recuperar los datos del registro
            int codPelicula = registros.getInt("codpelicula");
            String titulo = registros.getString("titulo");
            String tema = registros.getString("tema");
            int duracion = registros.getInt("duracion");
            double precio = registros.getDouble("precio");
            System.out.println(codPelicula + "\t" + titulo + "\t"
                    + tema + "\t" + duracion + "\t" + precio);
        }
    }

    public static int numRegistros(Connection conexion) throws SQLException {
        Statement sentencia
                = conexion.createStatement();
        ResultSet registros
                = sentencia.executeQuery("SELECT * FROM peliculas");
        // nos posicionamos con .last() en el último registro
        registros.last();
        // con .getRow() obtengo el numero de fila (numero de registro)
        int numeroRegistros = registros.getRow();
        // retornamos el numero de registros.
        return numeroRegistros;
    }

    public static void consultaPelicula(Connection conexion,
            int codPelicula) throws SQLException {
        // Creamos la sentencia preparada SQL
        PreparedStatement sentencia = conexion.prepareStatement(
                "SELECT * FROM peliculas WHERE codpelicula=?");
        // Damos valor a los parámetros (?)
        sentencia.setInt(1, codPelicula);
        // Ejecutamos la consulta
        ResultSet registros = sentencia.executeQuery();
        // Recorremos el ResultSet registros hasta que
        // .next() devuelve false por no hay más registros
        while (registros.next()) {
            // recuperar los datos del registro
            String titulo = registros.getString("titulo");
            String tema = registros.getString("tema");
            int duracion = registros.getInt("duracion");
            double precio = registros.getDouble("precio");
            System.out.println(codPelicula + "\t" + titulo + "\t"
                    + tema + "\t" + duracion + "\t" + precio);
        }

    }
    
    public static void insertarPelicula(Connection conexion,
        Pelicula miPelicula) throws SQLException{
        // Creamos consulta preparada
        PreparedStatement sentencia = conexion.prepareStatement(
         "INSERT INTO peliculas VALUES(?,?,?,?,?)");
        // Damos valor a los parámetros (?)
        sentencia.setInt(1, miPelicula.getCodPelicula());
        sentencia.setString(2, miPelicula.getTitulo());
        sentencia.setString(3, miPelicula.getTema());
        sentencia.setInt(4, miPelicula.getDuracion());
        sentencia.setDouble(5, miPelicula.getPrecio());
        // Ejecutamos la sentencia con .executeUpdate()
        int resultado = sentencia.executeUpdate();
        if(resultado>0){
            System.out.println("Pelicula Insertada");
        } else {
            System.out.println("Pelicula NO insertada");
        }   
    }
    
    public static void actualizarPelicula(Connection conexion,
            Pelicula miPelicula) throws SQLException{
        // Creamos la consulta preparada
        PreparedStatement sentencia = conexion.prepareStatement(
            "UPDATE peliculas SET titulo=?, tema=?, duracion=?, precio=?"
                    + " WHERE codpelicula=?");
        // Damos valor a los parámetros
        sentencia.setString(1, miPelicula.getTitulo());
        sentencia.setString(2, miPelicula.getTema());
        sentencia.setInt(3, miPelicula.getDuracion());
        sentencia.setDouble(4, miPelicula.getPrecio());
        sentencia.setInt(5, miPelicula.getCodPelicula());
        // Ejecutamos la sentencia y obtenemos el número de
        // peliculas afectadas 
        int resultado = sentencia.executeUpdate();
        // Indicamos si la pelicula ha sido actualizada
        if(resultado>0){
            System.out.println("Pelicula Actualizada");
        } else{
            System.out.println("Pelicula NO Actualizada");
        }
    } 
    
    public static void eliminarPelicula(Connection conexion, 
        int codPelicula) throws SQLException{
        // Creamos la sentencia preparada
         PreparedStatement sentencia = conexion.prepareStatement(
            "DELETE FROM peliculas WHERE codpelicula=?");
        // Damos valor a los parámetros
        sentencia.setInt(1, codPelicula);
        //Ejecutamos la sentecia y obtenemos numero registros afectados
        int resultado = sentencia.executeUpdate();
        if(resultado>0){
            System.out.println("Pelicula Eliminada");
        } else{
            System.out.println("Pelicula NO Eliminada");
        }
        
        // Método que muestre las peliculas que empiezan por E
        // y son de tema Aventuras
    }
    public static void consPreparada(Connection conexion, String letra, String tema) throws SQLException {
        PreparedStatement sentencia = conexion.prepareStatement("SELECT * FROM peliculas WHERE titulo LIKE ? AND tema = ?");
        sentencia.setString(1, letra + "%");
        sentencia.setString(2, tema);
        ResultSet registros = sentencia.executeQuery();
        while (registros.next()) {
            int codPelicula = registros.getInt("codpelicula");
            String titulo = registros.getString("titulo");
            int duracion = registros.getInt("duracion");
            double precio = registros.getDouble("precio");
            System.out.println(codPelicula + "\t" + titulo + "\t" + tema + "\t" + duracion + "\t" + precio);
        }
    }
}
