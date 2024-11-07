package viaje;
public class ViajeClass {
    private String codigo;
    private String destino;
    private double kilometros;

    public ViajeClass(String codigo, String destino, double kilometros) {
        this.codigo = codigo;
        this.destino = destino;
        this.kilometros = kilometros;
    }
    public ViajeClass(ViajeClass otroViaje){
        this.codigo = otroViaje.codigo;
        this.destino = otroViaje.destino;
        this.kilometros = otroViaje.kilometros;
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

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    @Override
    public String toString() {
        return "ViajeClass{" + "codigo=" + codigo + ", destino=" + destino + ", kilometros=" + kilometros + '}';
    }
    
    
}
