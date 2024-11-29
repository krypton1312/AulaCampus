package objetos;

public class Manzana extends Fruta {
    private String fechaDeCaducidad;
    private String variedad;

    public Manzana(String nombre, String origen, double precioPorUnidad, String fechaDeCaducidad, String variedad) {
        super(nombre, origen, precioPorUnidad);
        this.fechaDeCaducidad = fechaDeCaducidad;
        this.variedad = variedad;
    }

    public String getFechaDeCaducidad() {
        return fechaDeCaducidad;
    }

    public void setFechaDeCaducidad(String fechaDeCaducidad) {
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +"Manzana{" + "fechaDeCaducidad=" + fechaDeCaducidad + ", variedad=" + variedad + '}';
    }
    
    
}
