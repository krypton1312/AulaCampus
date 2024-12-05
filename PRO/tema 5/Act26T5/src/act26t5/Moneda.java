package act26t5;

import java.util.Random;

public class Moneda extends Sorteo {
    private Random random;
    
    public Moneda() {
        this.random = new Random();
    }

    @Override
    public void lanzar() {
        int resultado = random.nextInt(2); 
        if (resultado == 0) {
            System.out.println("La moneda muestra: Cara");
        } else {
            System.out.println("La moneda muestra: Cruz");
        }
    }
}