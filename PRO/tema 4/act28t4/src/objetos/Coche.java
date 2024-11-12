package objetos;

public class Coche extends Vehiculo {

    public int puertas;

    public Coche(String matricula, int puertas) {
        super(matricula);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Coche{" + "matricula=" + getMatricula() + " puertas=" + puertas + " velocidad=" + getVelocidad() +'}';
    }
}
