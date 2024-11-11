package objetos;

public class Libro implements Interfaz{
    private String codigo;
    private String titulo;
    private int anyo;
    private boolean prestado;

    public Libro(String codigo, String titulo, int anyo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anyo = anyo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return "Libro{" + "codigo=" + codigo + ", titulo=" + titulo + ", anyo=" + anyo + ", prestado=" + prestado + '}';
    }
    
    @Override
    public void prestar(){
        setPrestado(true);
    }
    @Override
    public void devolver(){
        setPrestado(false);
    }
}
