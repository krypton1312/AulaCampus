package objetos;

public class Coche extends Vehiculo{
    private boolean elevalunasEl;
    private boolean airbag;
    private boolean cierreCen;
    private String motor;

    public Coche(boolean elevalunasEl, boolean airbag, boolean cierreCen, String motor, String matricula, String marca, String modelo, int cilindrado, int potencia, int velocida, String color, double precio) {
        super(matricula, marca, modelo, cilindrado, potencia, velocida, color, precio);
        this.elevalunasEl = elevalunasEl;
        this.airbag = airbag;
        this.cierreCen = cierreCen;
        this.motor = motor;
        setPrecio(precio + importeExtra() + super.calculaIVA());
    }

    public boolean isElevalunasEl() {
        return elevalunasEl;
    }

    public void setElevalunasEl(boolean elevalunasEl) {
        this.elevalunasEl = elevalunasEl;
    }

    public boolean isAirbag() {
        return airbag;
    }

    public void setAirbag(boolean airbag) {
        this.airbag = airbag;
    }

    public boolean isCierreCen() {
        return cierreCen;
    }

    public void setCierreCen(boolean cierreCen) {
        this.cierreCen = cierreCen;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Coche{" + "elevalunasEl=" + elevalunasEl + ", airbag=" + airbag + ", cierreCen=" + cierreCen + ", motor=" + motor + '}';
    }
    
    @Override
    public int importeExtra(){
        return (this.motor.equals("D") ? 2000 : 0)
             + (this.cierreCen ? 500 : 0)
             + (this.airbag ? 1000 : 0)
             + (this.elevalunasEl ? 750 : 0);
    }
}
