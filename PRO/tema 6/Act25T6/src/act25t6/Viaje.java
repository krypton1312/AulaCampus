package act25t6;

public class Viaje {
    private String codigo;
    private String destino;
    private int dias;
    private String hotel;
    private String regimen;
    private double precio;

    public Viaje(String codigo, String destino, int dias, String hotel, String regimen, double precio) {
        this.codigo = codigo;
        this.destino = destino;
        this.dias = dias;
        this.hotel = hotel;
        this.regimen = regimen;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getRegimen() {
        return regimen;
    }

    public void setRegimen(String regimen) {
        this.regimen = regimen;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTodosDatos() {
        return "<html>Codigo:" + getCodigo() + 
                "<br>Destino: " + getDestino() +
                "<br>Dias: " + getDias() +
                "<br>Hotel: " + getHotel() +
                "<br>Regimen de alojamiento: " + getRegimen() +
                "<br>Precio: " + getPrecio() + "</html>";
    }
    
    @Override
    public String toString() {
        return "Viaje{" + "codigo=" + codigo + ", destino=" + destino + ", dias=" + dias + ", hotel=" + hotel + ", regimen=" + regimen + ", precio=" + precio + '}';
    }    
}
