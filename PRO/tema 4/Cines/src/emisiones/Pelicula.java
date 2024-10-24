package emisiones;

public class Pelicula {
    private String titulo;
    private String genero;
    private String director;
    private boolean nacional;
    private String duracion;
    private int espectadores;
    private double precio;
    
    private static int cantidadPeliculas = 0;
    private static int espectadoresTotal = 0;
    private static int peliculasNacionales = 0;
    private static int generoAventura = 0;
    private static int generoComedia = 0;
    private static int generoDrama = 0;

    public Pelicula(String titulo, String genero, String director, boolean nacional, String duracion, int espectadores, double precio) {
        this.titulo = titulo;
        this.genero = genero;
        this.director = director;
        this.nacional = nacional;
        this.duracion = duracion;
        this.espectadores = espectadores;
        this.precio = precio;
        
        this.cantidadPeliculas++;
        this.espectadoresTotal += espectadores;
        if(nacional){
            peliculasNacionales++;
        }
        if(genero.equals("Aventura"))
        {
            this.generoAventura++;
        }
        if(genero.equals("Comedia"))
        {
            this.generoComedia++;
        }
        if(genero.equals("Drama"))
        {
            this.generoDrama++;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
        if(genero.equals("Aventura"))
        {
            this.generoAventura++;
        }
        if(genero.equals("Comedia"))
        {
            this.generoComedia++;
        }
        if(genero.equals("Drama"))
        {
            this.generoDrama++;
        }
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public boolean isNacional() {
        return nacional;
    }

    public void setNacional(boolean nacional) {
        this.nacional = nacional;
        if(nacional){
            peliculasNacionales++;
        }
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(int espectadores) {
        this.espectadoresTotal-=this.espectadores;
        this.espectadores = espectadores;
        this.espectadoresTotal+=espectadores;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", genero=" + genero + ", director=" + director + ", nacional=" + nacional + ", duracion=" + duracion + ", espectadores=" + espectadores + ", precio=" + precio + '}';
    }
    
    public String toStringTotal(){
        return "Totales{" + "cantidadPeliculas=" + cantidadPeliculas + ", generoAventura=" + generoAventura + ", generoDrama=" + generoDrama + ", generoComedia=" + generoComedia + ", peliculasNacionales=" + peliculasNacionales + ", espectadoresTotal=" + espectadoresTotal + '}';
    }
}
