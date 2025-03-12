public class Coche extends Vehiculo {

    private int numPuertas;

    private String extras;

    public Coche(int numPuertas, String extras, String matricula, String marca, String modelo, double precio, int cilindrado) {
        super(matricula, marca, modelo, precio, cilindrado);
        this.numPuertas = numPuertas;
        this.extras = extras;
    }
 
    public int getNumPuertas() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setNumPuertas(int numPuertas) {
    }

    public String toString() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
