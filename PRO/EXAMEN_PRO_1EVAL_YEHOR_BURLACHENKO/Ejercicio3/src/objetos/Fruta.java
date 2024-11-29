package objetos;

public class Fruta {
    private String nombre;
    private String origen;
    private double precioPorUnidad;

    public Fruta(String nombre, String origen, double precioPorUnidad) {
        this.nombre = nombre;
        this.origen = origen;
        this.precioPorUnidad = precioPorUnidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public double getPrecioPorUnidad() {
        return precioPorUnidad;
    }

    public void setPrecioPorUnidad(double precioPorUnidad) {
        this.precioPorUnidad = precioPorUnidad;
    }
    
    public double precioFinal(boolean importacion){
        return (importacion ? getPrecioPorUnidad()* 1.1 : getPrecioPorUnidad());
    }
    
    public double precioFinal(int cantidad){
        return getPrecioPorUnidad() * cantidad;
    }
    
    public double precioFinal(double descuento){
        return getPrecioPorUnidad() * descuento;
    }
    
    @Override
    public String toString() {
        return "Fruta{" + "nombre=" + nombre + ", origen=" + origen + ", precioPorUnidad=" + precioPorUnidad + '}';
    }
    
}
