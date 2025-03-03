package ejercicio3;

import java.time.LocalDate;
import java.time.LocalTime;


public class Espectador {
    private int fila;
    private int asiento;
    private LocalDate fecha;
    private LocalTime hora;
    private String tituloPelicula;

    public Espectador(int fila, int asiento, LocalDate fecha, LocalTime hora, String tituloPelicula) {
        this.fila = fila;
        this.asiento = asiento;
        this.fecha = fecha;
        this.hora = hora;
        this.tituloPelicula = tituloPelicula;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public void setTituloPelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula;
    }
    @Override
    public String toString() {
        return "Espectador{" + "fila=" + fila + ", asiento=" + asiento + ", fecha=" + fecha + ", hora=" + hora + ", tituloPelicula=" + tituloPelicula + '}';
    }
}
