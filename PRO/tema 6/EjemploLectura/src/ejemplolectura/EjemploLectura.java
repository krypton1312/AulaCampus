package ejemplolectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjemploLectura {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File miFichero = new File("informacion.txt");
        FileReader fr = new FileReader(miFichero);
        
        int codigo = 0;
        char letra;
        
        while((codigo = fr.read()) != -1){
            letra = (char)codigo;
            System.out.print(letra);
        }
        
        fr.close();
    }
}
