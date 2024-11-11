package objetos;
public class Autobus extends Vehiculo {
    private int plazas;
    private boolean tacometro;

    public Autobus(int plazas, boolean tacometro, String matricula, String marca, String modelo, int cilindrado, int potencia, int velocida, String color, double precio) {
        super(matricula, marca, modelo, cilindrado, potencia, velocida, color, precio);
        this.plazas = plazas;
        this.tacometro = tacometro;
        setPrecio(precio + importeExtra() + super.calculaIVA());
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public boolean isTacometro() {
        return tacometro;
    }

    public void setTacometro(boolean tacometro) {
        this.tacometro = tacometro;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +"Autobus{" + "plazas=" + plazas + ", tacometro=" + tacometro + '}';
    }
    @Override
    public int importeExtra(){
        return (this.plazas > 40 && this.plazas < 60 ? 4000 : 0)
             + (this.plazas > 60 ? 6500 : 0);
    } 
}
