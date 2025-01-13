package ejemploarrays;
import java.util.Arrays;

public class EjemploArrays {
    public static void main(String[] args) {
        double[] temperaturas = {10.5, 7.3, 5.6, 15.3, 4.4, 18.2, 21.1};
        
        double[] temperaturasCopia = temperaturas.clone();
        temperaturasCopia[3] = 12.5;
        System.out.println(Arrays.toString(temperaturas));
        System.out.println(Arrays.toString(temperaturasCopia));
        
        System.out.println(Arrays.equals(temperaturas, temperaturasCopia));
        
        Arrays.sort(temperaturas);
        System.out.println(Arrays.toString(temperaturas));
        System.out.println(Arrays.binarySearch(temperaturas, 10.5));
        
        int[] valores = new int[5];
        Arrays.fill(valores, -1);
        System.out.println(Arrays.toString(valores));
        
        double[] masTemperaturas = Arrays.copyOf(temperaturas, 9);
        System.out.println(Arrays.toString(masTemperaturas));
        
        int[][] numeros = {{1,0,1}, {0,0,1},{1,1,1}};
        for (int[] row: numeros) {
            for (int element: row) {
                System.out.print(element + " ");
            }
            System.out.println("");
        }
        System.out.println(Arrays.deepToString(numeros));
        
    }
}
