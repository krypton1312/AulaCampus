package ejemplolecturalinea;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjemploLecturaLinea {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File miFichero = new File("Alumnos.txt");
        FileReader fr = new FileReader(miFichero);
        BufferedReader br = new BufferedReader(fr);
        
        String linea = "";
        
        String[] datos;
        
        while ((linea = br.readLine()) != null) {            
            datos = linea.split(";");
            String nombre = datos[0];
            double nota = Double.parseDouble(datos[1].replace(",","."));
            int boletin = Integer.parseInt(datos[2]);
            Alumno miAlumno = new Alumno(nombre, nota, boletin);
            System.out.println("Nombre:" + miAlumno.getNombre());
            System.out.println("Nota:" + miAlumno.getNota());
            System.out.println("Boletin:" + miAlumno.getBoletin());
            System.out.println("---------------------------------");
        }
        
        br.close();
        fr.close();
    }
}
