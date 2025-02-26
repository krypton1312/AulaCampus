package ejercicio3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Votacion {
    private String dniVotante;
    private String nombreVotante;
    private String apellidosVotante;
    private String fecha;
    private String hora;
    private String voto;

    public Votacion(String dniVotante, String nombreVotante, String apellidosVotante,String voto) {
        this.dniVotante = dniVotante;
        this.nombreVotante = nombreVotante;
        this.apellidosVotante = apellidosVotante;
        this.fecha = LocalDate.now().toString();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm");
        this.hora = LocalDateTime.now().format(format);
        this.voto = voto;
    }

    public String getDniVotante() {
        return dniVotante;
    }

    public void setDniVotante(String dniVotante) {
        this.dniVotante = dniVotante;
    }

    public String getNombreVotante() {
        return nombreVotante;
    }

    public void setNombreVotante(String nombreVotante) {
        this.nombreVotante = nombreVotante;
    }

    public String getApellidosVotante() {
        return apellidosVotante;
    }

    public void setApellidosVotante(String apellidosVotante) {
        this.apellidosVotante = apellidosVotante;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getVoto() {
        return voto;
    }

    public void setVoto(String voto) {
        this.voto = voto;
    }
    @Override
    public String toString() {
        return "Votacion{" + "dniVotante=" + dniVotante + ", nombreVotante=" + nombreVotante + ", apellidosVotante=" + apellidosVotante + ", fecha=" + fecha + ", hora=" + hora + ", voto=" + voto + '}';
    }
    
    
}
