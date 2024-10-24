package mapa.fisico;

public class Rio {
    private String nombre;
    private double longitud;
    private int afluentes;

    public Rio(String nombre, double longitud, int afluentes) {
        this.nombre = nombre;
        this.longitud = longitud;
        this.afluentes = afluentes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public int getAfluentes() {
        return afluentes;
    }

    public void setAfluentes(int afluentes) {
        this.afluentes = afluentes;
    }

    @Override
    public String toString() {
        return "Rio{" + "nombre=" + nombre + ", longitud=" + longitud + ", afluentes=" + afluentes + '}';
    }
    
    
}
