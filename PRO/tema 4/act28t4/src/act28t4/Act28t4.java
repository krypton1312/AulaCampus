package act28t4;

import objetos.*;
import java.util.Scanner;

public class Act28t4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Vehiculo[] vehiculos = new Vehiculo[4];
        /*
        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println("coche o camion?");
            if(s.next().equals("coche")){
                System.out.println("Introduce matricula y numero de puertas: ");
                vehiculos[i] = new Coche(s.next(), s.nextInt());
            }else if(s.next().equals("camion")){
                System.out.println("Intoduce matricula: ");
                vehiculos[i] = new Camion(s.next());
            }
        }
         */

        vehiculos[0] = new Coche("WDIJDW", 2);
        vehiculos[1] = new Coche("IOJWDW", 4);
        vehiculos[2] = new Camion("CAMION1");
        vehiculos[3] = new Camion("CAMION2");

        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println(vehiculos[i]);
        }
        System.out.println("----------------------------------------");
        Remolque remolque = new Remolque(5000);

        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i] instanceof Camion) {
                ((Camion) vehiculos[i]).ponRemolque(remolque);
            }
        }
        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println(vehiculos[i]);
        }
        System.out.println("----------------------------------------");
        for (int i = 0; i < vehiculos.length; i++) {
            vehiculos[i].acelerar(100);
        }
        System.out.println("----------------------------------------");
        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println(vehiculos[i]);
        }
    }
}
