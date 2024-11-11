package objetos;

public class Revista {
    private String codigo;
    private String titulo;
    private int anyo;
    private int numero;

    public Revista(String codigo, String titulo, int anyo, int numero) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anyo = anyo;
        this.numero = numero;
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Revista{" + "codigo=" + codigo + ", titulo=" + titulo + ", anyo=" + anyo + ", numero=" + numero + '}';
    }
    
    
}
