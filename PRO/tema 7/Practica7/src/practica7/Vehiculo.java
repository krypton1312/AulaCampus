package practica7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private LocalDate fechaMatricula;
    private double cilidrada;
    private double potencia;
    private LocalDateTime horaLlegada;
    public static ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public Vehiculo(String matricula, String marca, String modelo, LocalDate fechaMatricula, double cilidrada, double potencia, LocalDateTime horaLlegada) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.fechaMatricula = fechaMatricula;
        this.cilidrada = cilidrada;
        this.potencia = potencia;
        this.horaLlegada = horaLlegada;
        vehiculos.add(this);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDate getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(LocalDate fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    public double getCilidrada() {
        return cilidrada;
    }

    public void setCilidrada(double cilidrada) {
        this.cilidrada = cilidrada;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public LocalDateTime getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(LocalDateTime horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public String calcularTiempoEspera() {
        LocalDateTime ahora = LocalDateTime.now();
        long minutos = ChronoUnit.MINUTES.between(horaLlegada, ahora);
        
        if (minutos >= 1440) {
            long dias = minutos / 1440;
            long horasRestantes = (minutos % 1440) / 60;
            return dias + " día(s) y " + horasRestantes + " hora(s)";
        }
        else if (minutos >= 60) {
            long horas = minutos / 60;
            long minutosRestantes = minutos % 60;
            return horas + " hora(s) y " + minutosRestantes + " minuto(s)";
        }
        else {
            return minutos + " minuto(s)";
        }
    }
    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", fechaMatricula=" + fechaMatricula + ", cilidrada=" + cilidrada + ", potencia=" + potencia + ", horaLlegada=" + horaLlegada + '}';
    }
}
