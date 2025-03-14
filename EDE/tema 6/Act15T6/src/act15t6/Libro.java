package act15t6;

public class Libro {

    private int idLibro;
    private String titulo;
    private String autor;
    private Editorial editor;
    private String poblacionEditorial;

    public Libro(int idLibro, String titulo, String autor, Editorial editor, String poblacionEditorial) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.autor = autor;
        this.editor = editor;
        this.poblacionEditorial = poblacionEditorial;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
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

    public Editorial getEditor() {
        return editor;
    }

    public void setEditor(Editorial editor) {
        this.editor = editor;
    }

    public String getPoblacionEditorial() {
        return poblacionEditorial;
    }

    public void setPoblacionEditorial(String poblacionEditorial) {
        this.poblacionEditorial = poblacionEditorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "idLibro=" + idLibro + ", titulo=" + titulo + ", autor=" + autor + ", editor=" + editor + ", poblacionEditorial=" + poblacionEditorial + '}';
    }
    
    
}
