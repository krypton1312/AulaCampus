package objetos;

public class Impresora extends Hardware{
    private boolean color;
    private String tipo;
    private boolean recambioTinta;

    public Impresora(boolean color, String tipo, boolean recambioTinta, String codigo, String marca, String modelo, String descripcion, double precio) {
        super(codigo, marca, modelo, descripcion, precio);
        this.color = color;
        this.tipo = tipo;
        this.recambioTinta = recambioTinta;
    }

    public Impresora() { 
       this.color = true;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isRecambioTinta() {
        return recambioTinta;
    }

    public void setRecambioTinta(boolean recambioTinta) {
        this.recambioTinta = recambioTinta;
    }
    
    public double importeFinal(double IVA){
        return super.getPrecio() + (super.getPrecio()*(IVA/100));
    }
    
    public double importeFinal(double IVA, double descuento){
        return (super.getPrecio() - super.getPrecio()*(descuento/100) ) + (super.getPrecio()*(IVA/100));
    }
    public double importeFinal(double IVA, double descuento, boolean empleado){
        double descuentoFinal = descuento + (empleado ? 10 : 0);
        double precioConDescuento = super.getPrecio() * (1 - descuentoFinal / 100);
        return precioConDescuento * (1 + IVA / 100);
    }
    @Override
    public String toString() {
        return super.toString() + "\nImpresora{" + "color=" + color + ", tipo=" + tipo + ", recambioTinta=" + recambioTinta + '}';
    }

}
