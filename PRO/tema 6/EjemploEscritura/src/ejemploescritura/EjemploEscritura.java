package ejemploescritura;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploEscritura {
    public static void main(String[] args) throws IOException {
        File miFichero = new File("datos.txt");
        FileWriter fw = new FileWriter(miFichero);
        
        String texto = "Esto es otro ejemplo de escritura\n";
        
        fw.append(texto);
        
        fw.flush();
        
        fw.close();
    }
}
