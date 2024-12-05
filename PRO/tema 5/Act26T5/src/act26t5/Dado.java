package act26t5;

import java.util.Random;

// Clase que representa un dado
public class Dado extends Sorteo {
    private Random random;

    // Constructor
    public Dado() {
        this.random = new Random();
    }

    @Override
    public void lanzar() {
        int resultado = random.nextInt(6) + 1;
        System.out.println("El dado muestra: " + resultado);
    }
}
