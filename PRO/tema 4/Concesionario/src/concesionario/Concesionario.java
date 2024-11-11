package concesionario;
import objetos.*;

public class Concesionario {
    public static void main(String[] args) {
        Coche coche1 = new Coche(true, true, true, "D", 
                        "1234ABC", "Toyota", "Corolla", 1800, 
                        140, 180, "Rojo", 15000);
        Coche coche2 = new Coche(false, true, false, "G", 
                        "5678DEF", "Ford", "Fiesta", 1200, 
                        90, 170, "Azul", 12000);
        Moto moto1 = new Moto(true, 4, "cadena", 
                     "4321GHI", "Yamaha", "YZF-R3", 300, 
                     42, 190, "Negro", 5000);
        Moto moto2 = new Moto(false, 2, "correa", 
                     "8765JKL", "Honda", "CB125R", 125, 
                     13, 120, "Blanco", 3500);
        Autobus autobus1 = new Autobus(50, true, 
                     "1357MNO", "Mercedes-Benz", "Sprinter", 3000, 
                     150, 130, "Amarillo", 70000);
        Autobus autobus2 = new Autobus(30, false, 
                     "2468PQR", "Volvo", "B9R", 6000, 
                      300, 120, "Azul", 90000);
        
        System.out.println(coche1);
        System.out.println(coche2);
        System.out.println(moto1);
        System.out.println(moto2);
        System.out.println(autobus1);
        System.out.println(autobus2);
    }
}
