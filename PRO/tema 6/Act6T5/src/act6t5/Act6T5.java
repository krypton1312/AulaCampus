package act6t5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Act6T5 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader("alumnos.txt");
        int codigo = 0;
        while((codigo = fr.read()) != -1){
            System.out.print((char)codigo);
        }
        fr.close();
    }
}
