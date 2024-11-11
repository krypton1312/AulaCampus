package inmueble.vivenda;
import inmueble.Inmueble;

public class Vivenda extends Inmueble {
    private String alturaViviendal;
    private boolean balcon;
    private boolean exterior;
    private double comision;

    public Vivenda(String codigo, String tipo, String direccion, String poblacion, double metrosCuad, int habitaciones, int baños, int garaje, double precio, String alturaViviendal, boolean balcon, boolean exterior) {
        super(codigo, tipo, direccion, poblacion, metrosCuad, habitaciones, baños, garaje, precio);
        this.alturaViviendal = alturaViviendal;
        this.balcon = balcon;
        this.exterior = exterior;
        comision();
    }

    public String getAlturaViviendal() {
        return alturaViviendal;
    }

    public void setAlturaViviendal(String alturaViviendal) {
        this.alturaViviendal = alturaViviendal;
    }

    public boolean isBalcon() {
        return balcon;
    }

    public void setBalcon(boolean balcon) {
        this.balcon = balcon;
    }

    public boolean isExterior() {
        return exterior;
    }

    public void setExterior(boolean exterior) {
        this.exterior = exterior;
    }
    
    
    @Override
    public void comision(){
        this.comision = getPrecio()*0.05;
        setPrecio(getPrecio()*0.05);
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Vivenda{" + "alturaViviendal=" + alturaViviendal + ", balcon=" + balcon + ", exterior=" + exterior + ", comision=" + comision + '}';
    }
    
    
}
