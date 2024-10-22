package ejemplopaquetes;
import objetos.Libro;

public class EjemploPaquetes {
    public static void main(String[] args) {
        Libro miLibro = new Libro("123", "titulo");
        System.out.println(miLibro.toString());
    }
}
