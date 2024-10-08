public class Act1T2 {
    public static void main(String[] args) {
        System.out.print("1-4 tarea, 5 stop");
        int numTarea = Integer.parseInt(System.console().readLine());
        switch (numTarea) {
            case 1: act1();
            case 2: act2();
            case 3: act3();
            case 4: act4();
            case 5: break;
        }
    }

    public static void act1() {
        System.out.print("Introduce un numero: ");
        int numero = Integer.parseInt(System.console().readLine());
        if (numero < 0) {
            System.out.print("Es negativo ");
        } else if (numero > 0) {
            System.out.print("Es positivo ");
        } else {
            System.out.print("Es 0..........");
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

    public static void act3() {
        int edad = 1;
        int menor = 0;
        while (edad > 0) {
            edad = Integer.parseInt(System.console().readLine());
            if (edad < 18) {
                menor++;
            }
        }
        System.out.print("Menores: " + menor);
    }

    public static void act4() {
        String[] alumnos = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Nombre del alumno " + i + ": ");
            alumnos[i] = System.console().readLine();
        }
        System.out.print("Introduce index del alumno: ");
        try {
            int index = Integer.parseInt(System.console().readLine());
            System.out.print("Nombre del alumno: " + alumnos[index]);
        } catch (Exception e) {
            System.out.println("ERROR:" + e);
        }
    }
}
