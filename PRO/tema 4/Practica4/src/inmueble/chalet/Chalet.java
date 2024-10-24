package inmueble.chalet;
import inmueble.Inmueble;

public class Chalet extends Inmueble {
    private double parcelaMetros;
    private boolean piscina;
    private boolean paellero;
    private double comision;

    public Chalet(String codigo, String tipo, String direccion, String poblacion, double metrosCuad, int habitaciones, int baños, int garaje, double precio, double parcelaMetros, boolean piscina, boolean paellero) {
        super(codigo, tipo, direccion, poblacion, metrosCuad, habitaciones, baños, garaje, precio);
        this.parcelaMetros = parcelaMetros;
        this.piscina = piscina; 
        this.paellero = paellero;
        comisionChalet();
    }

    public double getParcelaMetros() {
        return parcelaMetros;
    }

    public void setParcelaMetros(double parcelaMetros) {
        this.parcelaMetros = parcelaMetros;
    }

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public boolean isPaellero() {
        return paellero;
    }

    public void setPaellero(boolean paellero) {
        this.paellero = paellero;
    }
    
    public void comisionChalet() {
        double precioOriginal = getPrecio();
        this.comision = 0;

        if (piscina) {
            setPrecio(precioOriginal + 1000);
            this.comision += 1000;
        }

        if (paellero) {
            setPrecio(getPrecio() + 500);
            this.comision += 500;
        }

        this.comision += precioOriginal * 0.05;
        setPrecio(getPrecio() + precioOriginal * 0.05);
    }


    @Override
    public String toString() {
        System.out.println(super.toString());
        return " Chalet{" + "parcelaMetros=" + this.parcelaMetros
                + ", piscina=" + this.piscina + ", paellero=" + this.paellero
                + ", comision=" + this.comision + '}';
    }

}
