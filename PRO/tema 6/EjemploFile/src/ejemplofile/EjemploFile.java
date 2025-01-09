package ejemplofile;
import java.io.*;
public class EjemploFile {
    public static void main(String[] args) {
        File miFichero = new File("datos/archivo.txt"); //  or - datos\\archivo.txt
        File tuFichero = new File("datos\\achivoC.txt");
        File miCarpeta = new File("curso");
        File origen = new File("."); // - dir actual

        System.out.println("Ruta absoluta: " + miFichero.getAbsolutePath());
        
        System.out.println("Nombre del archivo: " + miFichero.getName());
        
        System.out.println("Ruta: " + miFichero.getPath());
        
        System.out.println("Directorio padre: " + miFichero.getParent());
        
        System.out.println("Tamanyo del file: " + miFichero.length() + " bytes.");
        
        System.out.println("Permiso ejecucion: " + miFichero.canExecute());
        System.out.println("Permiso lectura: " + miFichero.canRead());
        System.out.println("Permiso escritura: " + miFichero.canWrite());
        
        System.out.println("Es ficher: " + miFichero.isFile());
        System.out.println("Es carpeta: " + miFichero.isDirectory());
        
        System.out.println("Existe arhivo.txt: " + miFichero.exists());
        System.out.println("Existe arhivoC.txt: " + tuFichero.exists());
        
        miFichero.renameTo(tuFichero);
        System.out.println("Nuevo nombre: " + miFichero.getName());
        
        tuFichero.delete();
        
        miCarpeta.mkdir();
        
        String[] listado = origen.list();
        for (String nombre : listado) {
            System.out.println(nombre);
        }
    }
}
