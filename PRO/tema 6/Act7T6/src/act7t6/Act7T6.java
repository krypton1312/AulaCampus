package act7t6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Act7T6 {
    public static void main(String[] args) throws IOException {
        String[] productos = {"desc 1", "desc 2", "desc 3",
            "desc 4", "desc 5", "desc 6", "desc 7", "desc 8 ",
            "desc 9", "desc 10"};
        File miFichero = new File("Productos.txt");
        FileWriter fw = new FileWriter(miFichero);
        BufferedWriter bw = new BufferedWriter(fw);
        
        for(int i = 1; i < productos.length ; i++){
            bw.write("Producto " + i + ": "+  productos[i]);
            bw.newLine();
        }
        bw.flush();
        
        bw.close();
        fw.close();
    }
}
