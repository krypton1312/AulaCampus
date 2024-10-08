package act1netbeans.java;

import java.util.Scanner;

public class Act1NetbeansJava {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTarea = 0;
        while (numTarea != 5) {
            System.out.print("1-4 tarea, 5 stop: ");
            numTarea = Integer.parseInt(scanner.nextLine());
            switch (numTarea) {
                case 1:
                    act1(scanner);
                    break;
                case 2:
                    act2();
                    break;
                case 3:
                    act3(scanner);
                    break;
                case 4:
                    act4(scanner);
                    break;
                case 5:
                    break;
            }
        }
        scanner.close();
    }

    public static void act1(Scanner scanner) {
        System.out.print("Introduce un numero: ");
        int numero = Integer.parseInt(scanner.nextLine());
        if (numero < 0) {
            System.out.println("Es negativo ");
        } else if (numero > 0) {
            System.out.println("Es positivo ");
        } else {
            System.out.println("Es 0..........");
        }
    }

    public static void act2() {
        int[] par = new int[5];
        for (int i = 0; i < 5; i++) {
            int randomNumber = (int) (Math.random() * 101);
            System.out.println(randomNumber);
            if (randomNumber % 2 == 0) {
                par[i] = randomNumber;
            }
        }
        System.out.println("Numeros pares son: ");
        for (int j = 0; j < par.length; j++) {
            if (par[j] != 0) {
                System.out.println(par[j]);
            }
        }
    }

    public static void act3(Scanner scanner) {
        int edad = 1;
        int menor = 0;
        System.out.println("Intoroduce edad de alumnos: ");
        while (edad > 0) {
            edad = Integer.parseInt(scanner.nextLine());
            if (edad < 18) {
                menor++;
            }
        }
        System.out.print("Menores: " + menor);
    }

    public static void act4(Scanner scanner) {
        String[] alumnos = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Nombre del alumno " + (i+1) + ": ");
            alumnos[i] = scanner.nextLine();
        }
        System.out.print("Introduce index del alumno: ");
        try {
            int index = Integer.parseInt(scanner.nextLine());
            System.out.println("Nombre del alumno: " + alumnos[index]);
        } catch (Exception e) {
            System.out.println("ERROR:" + e);
        }
    }
}
