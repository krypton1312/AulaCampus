package act19t7;

import java.util.Random;

public class Act19T7 {
    public static void main(String[] args) {
        int alumnos = 20;
        int modulos = 3;

        double[][] notas = new double[alumnos][modulos];

        Random random = new Random();
        for (int i = 0; i < alumnos; i++) {
            for (int j = 0; j < modulos; j++) {
                notas[i][j] = Math.round(random.nextDouble() * 10 * 10) / 10.0; // Redondeo a 1 decimal
            }
        }
        
        System.out.println("Notas del grupo:");
        for (int i = 0; i < alumnos; i++) {
            System.out.print("Alumno " + (i + 1) + ": ");
            for (int j = 0; j < modulos; j++) {
                System.out.print(notas[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\nNota media de cada alumno:");
        for (int i = 0; i < alumnos; i++) {
            double suma = 0;
            for (int j = 0; j < modulos; j++) {
                suma += notas[i][j];
            }
            double media = Math.round((suma / modulos) * 10) / 10.0;
            System.out.println("Alumno " + (i + 1) + ": " + media);
        }
        
        System.out.println("\nMáxima nota de cada módulo:");
        for (int j = 0; j < modulos; j++) {
            double maxNota = 0;
            for (int i = 0; i < alumnos; i++) {
                if (notas[i][j] > maxNota) {
                    maxNota = notas[i][j];
                }
            }
            System.out.println("Módulo " + (j + 1) + ": " + maxNota);
        }
        System.out.println("\nNota media por módulo y alumnos que la sobrepasan:");
        
        for (int j = 0; j < modulos; j++) {
            double suma = 0;
            for (int i = 0; i < alumnos; i++) {
                suma += notas[i][j];
            }
            double mediaModulo = Math.round((suma / alumnos) * 10) / 10.0;

            int sobrepasan = 0;
            for (int i = 0; i < alumnos; i++) {
                if (notas[i][j] > mediaModulo) {
                    sobrepasan++;
                }
            }

            System.out.println("Módulo " + (j + 1) + ": Media = " + mediaModulo + ", Alumnos que la sobrepasan = " + sobrepasan);
        }
    }
}
