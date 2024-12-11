package ejemplolecturalinea;

public class Alumno {
    private String nombre;
    private double nota;
    private int boletin;

    public Alumno(String nombre, double nota, int boletin) {
        this.nombre = nombre;
        this.nota = nota;
        this.boletin = boletin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getBoletin() {
        return boletin;
    }

    public void setBoletin(int boletin) {
        this.boletin = boletin;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", nota=" + nota + ", boletin=" + boletin + '}';
    }
    
    
}
