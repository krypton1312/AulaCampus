package mapa.fisico;

public class Montaña {
    private String nombre;
    private double altura;
    private String pais;

    public Montaña(String nombre, double altura, String pais) {
        this.nombre = nombre;
        this.altura = altura;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Monta\u00f1a{" + "nombre=" + nombre + ", altura=" + altura + ", pais=" + pais + '}';
    }
    
    
}
