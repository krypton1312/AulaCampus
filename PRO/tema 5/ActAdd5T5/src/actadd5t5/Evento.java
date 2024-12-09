package actadd5t5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Evento {
    public static final List<Evento> instances = new ArrayList<>();
    private String codigo;
    private String descripcion;
    private String aforo;
    private String lugar;
    private String fecha;
    private String hora;
    private double precio;

    public Evento(String codigo, String descripcion, String aforo, String lugar, String fecha, String hora, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.aforo = aforo;
        this.lugar = lugar;
        this.fecha = fecha;
        this.hora = hora;
        this.precio = precio;
        instances.add(this);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAforo() {
        return aforo;
    }

    public void setAforo(String aforo) {
        this.aforo = aforo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public static List<Evento> getInstances() {
        return instances;
    }
    @Override
    public String toString() {
        return "Evento{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", aforo=" + aforo + ", lugar=" + lugar + ", fecha=" + fecha + ", hora=" + hora + ", precio=" + precio + '}';
    }
    
    private void calculaPrecioFinal(){
    }
    public LocalDate getLocalDateFecha(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDateFecha = LocalDate.parse(this.fecha, format);
        return localDateFecha;
    }
}
