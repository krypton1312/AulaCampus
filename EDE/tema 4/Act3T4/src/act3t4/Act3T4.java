package act3t4;

import java.util.Scanner;

public class Act3T4 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int[] numeros = new int[10];
        String numerosString = "[";
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce numero " + (i + 1));
            numeros[i] = tec.nextInt() * 2;
            tec.nextLine();
            numerosString+=numeros[i] + " ";
        }
        System.out.println(numerosString + " ]");
    }
}
