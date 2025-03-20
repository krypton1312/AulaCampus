package act18t6codigo;
public class Impresora extends Equipo{
    private String tipo;

    public Impresora(String tipo, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "Impresora{" + "tipo=" + tipo + '}';
    }
    
}
