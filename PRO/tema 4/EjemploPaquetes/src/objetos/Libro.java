package objetos;

public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private String editorial;
    private double precio;
    
    
    public Libro(String isbn, String titulo){
        this.isbn = isbn;
        this.titulo = titulo;
    }

    public Libro() {
    }

    public Libro(String isbn, String titulo, String autor, String editorial, double precio) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.precio = precio;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + ", precio=" + precio + '}';
    }
    
}
