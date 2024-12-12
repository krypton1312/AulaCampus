package act10t6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Act10T6 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String fileName = "nombres";
        BufferedReader br = new BufferedReader(new FileReader(fileName + ".txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName + "_sort.txt"));
        List<String> nameList = new ArrayList<>();
        String linea;
        int i = 0;
        while ((linea = br.readLine()) != null) {
            nameList.add(linea);
            i++;
        }
        String[] names = nameList.toArray(new String[0]);
        Arrays.sort(names);
        br.close();
        
        for (String name : names) {
            bw.write(name);
            bw.newLine();
        }
        
        bw.flush();
        bw.close();
    }
}
