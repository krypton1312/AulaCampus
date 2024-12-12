package act8t6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Act8T6 {
    public static void main(String[] args) throws IOException {
        File miFichero = new File("Productos.txt");
        FileReader fr = new FileReader(miFichero);
        BufferedReader br = new BufferedReader(fr);

        String linea = "";
        
        while((linea = br.readLine()) != null){
            System.out.println(linea);
        }
    }
}
