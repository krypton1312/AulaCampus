package act5t7;

import java.util.Arrays;

public class Act5T7 {
    public static void main(String[] args) {
        int[] numeros = new int[50];
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = (int)(Math.random()*50);
        }
        System.out.println(Arrays.toString(numeros));
        
        int suma = 0;
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] % 2 == 0){
                suma+=numeros[i];
            }
        }
        System.out.println(suma);
    }
}
