package objetos;

public class Moto extends Vehiculo {
    private boolean carenado;
    private int tiempos;
    private String transmision;

    public Moto(boolean carenado, int tiempos, String transmision, String matricula, String marca, String modelo, int cilindrado, int potencia, int velocida, String color, double precio) {
        super(matricula, marca, modelo, cilindrado, potencia, velocida, color, precio);
        this.carenado = carenado;
        this.tiempos = tiempos;
        this.transmision = transmision;
        setPrecio(precio + importeExtra() + super.calculaIVA());
    }

    public boolean getCarenado() {
        return carenado;
    }

    public void setCarenado(boolean carenado) {
        this.carenado = carenado;
    }

    public int getTiempos() {
        return tiempos;
    }

    public void setTiempos(int tiempos) {
        this.tiempos = tiempos;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +"Moto{" + "carenado=" + carenado + ", tiempos=" + tiempos + ", transmision=" + transmision + '}';
    }
    
 
    @Override
    public int importeExtra(){
        return (this.tiempos == 4 ? 1500 : 0 )
                + (this.transmision.equals("cadena") ? 500 : 0)
                + (this.transmision.equals("correa") ? 1000 : 0)
                + (this.transmision.equals("cardan") ? 1500 : 0);
    }
}
