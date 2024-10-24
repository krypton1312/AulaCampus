package inmueble;

public class Inmueble {

    private String codigo;
    private String tipo;
    private String direccion;
    private String poblacion;
    private double metrosCuad;
    private int habitaciones;
    private int baños;
    private int garaje;
    private double precio;

    public Inmueble(String codigo, String tipo, String direccion, String poblacion, double metrosCuad, int habitaciones, int baños, int garaje, double precio) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.metrosCuad = metrosCuad;
        this.habitaciones = habitaciones;
        this.baños = baños;
        this.garaje = garaje;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public double getMetrosCuad() {
        return metrosCuad;
    }

    public void setMetrosCuad(double metrosCuad) {
        this.metrosCuad = metrosCuad;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getBaños() {
        return baños;
    }

    public void setBaños(int baños) {
        this.baños = baños;
    }

    public int getGaraje() {
        return garaje;
    }

    public void setGaraje(int garaje) {
        this.garaje = garaje;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    private double calculaIVA(){
        return this.precio+(this.precio*0.10);
    }

    @Override
    public String toString() {
        return "Inmueble{" + "codigo=" + codigo + ", tipo=" + tipo + ", direccion=" + direccion + ", poblacion=" + poblacion + ", metrosCuad=" + metrosCuad + ", habitaciones=" + habitaciones + ", ba\u00f1os=" + baños + ", garaje=" + garaje + ", precio=" + precio + ", precio con IVA=" + calculaIVA() + '}';
    }
    
}
