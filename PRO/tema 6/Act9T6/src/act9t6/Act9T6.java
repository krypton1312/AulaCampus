package act9t6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Act9T6 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String[] fileNames = {"FirstFile", "SecondFile", "FinalFile"};
        File firstFile = new File(fileNames[0] + ".txt");
        File secondFile = new File(fileNames[1] + ".txt");
        File finalFile = new File(fileNames[2] + ".txt");

        BufferedReader firstFileReader = new BufferedReader(new FileReader(firstFile));
        BufferedReader secondFileReader = new BufferedReader(new FileReader(secondFile));
        BufferedWriter finalFileWriter = new BufferedWriter(new FileWriter(finalFile));

        String linea;

        finalFileWriter.write(fileNames[0] + ": \n");
        while ((linea = firstFileReader.readLine()) != null) {
            finalFileWriter.write(linea);
            finalFileWriter.newLine();
        }
        firstFileReader.close();
        
        finalFileWriter.write(fileNames[1] + ": \n");
        while ((linea = secondFileReader.readLine()) != null) {
            finalFileWriter.write(linea);
            finalFileWriter.newLine();
        }
        secondFileReader.close();
        
        finalFileWriter.flush();
        finalFileWriter.close();
    }
}
