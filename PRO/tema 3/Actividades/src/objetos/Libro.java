
package objetos;

public class Libro {
    private String titulo;
    private String autorl;
    private String editorial;
    private int numEjemplares;
    static private int numPrestados;
    private boolean prestado;

    public Libro() {
    }

    public Libro(String titulo, String autorl, String editorial, int numEjemplares, boolean prestado) {
        this.titulo = titulo;
        this.autorl = autorl;
        this.editorial = editorial;
        this.numEjemplares = numEjemplares;
        this.prestado = prestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutorl() {
        return autorl;
    }

    public void setAutorl(String autorl) {
        this.autorl = autorl;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public static int getNumPrestados() {
        return numPrestados;
    }

    public static void setNumPrestados(int numPrestados) {
        Libro.numPrestados = numPrestados;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
       public boolean prestar() {
        if (numEjemplares > numPrestados) {
            numPrestados++;
            return true; 
        }
        return false; 
    }


    public boolean devolver() {
        if (numPrestados > 0) {
            numPrestados--;
            return true; 
        }
        return false; 
    }

    // Método perdido
    public boolean perdido() {
        if (numEjemplares > 0) {
            numEjemplares--; 
            if (numPrestados > numEjemplares) {
                numPrestados = numEjemplares; 
            }
            return true;
        }
        return false; 
    }
    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autorl=" + autorl + ", editorial=" + editorial + ", numEjemplares=" + numEjemplares + ", prestado=" + prestado + '}';
    }
    
}
