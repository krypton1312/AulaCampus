package bibliotecaej23;
import objetos.*;
public class BibliotecaEj23 {
    public static void main(String[] args) {
        Libro libro1 = new Libro("cod1", "tit1" , 2025);
        System.out.println(libro1);
        libro1.prestar();
        System.out.println(libro1.isPrestado());
        
        Revista rev1 = new Revista("rev1" , "titRev" , 2024, 1);
        System.out.println(rev1);
    }
}
