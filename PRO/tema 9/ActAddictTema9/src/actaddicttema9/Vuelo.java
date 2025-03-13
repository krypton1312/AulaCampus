package actaddicttema9;

import java.time.LocalDate;
import java.time.LocalTime;

public class Vuelo {
    private int idVuelo;
    private String destino;
    private String fechaSalida;
    private String  horaSalida;

    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public Vuelo(int idVuelo, String destino, String fechaSalida, String horaSalida, int numPasajeros) {
        this.idVuelo = idVuelo;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
        this.numPasajeros = numPasajeros;
    }
    private int numPasajeros;

    
    @Override
    public String toString() {
        return "Vuelo{" + "idVuelo=" + idVuelo + ", destino=" + destino + ", fechaSalida=" + fechaSalida + ", horaSalida=" + horaSalida + ", numPasajeros=" + numPasajeros + '}';
    }
}
