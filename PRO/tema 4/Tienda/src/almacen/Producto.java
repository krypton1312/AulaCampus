package almacen;

public class Producto {
    private String codigo;
    private String description;
    private double precio;

    public Producto(String codigo, String description, double precio) {
        this.codigo = codigo;
        this.description = description;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", description=" + description + ", precio=" + precio + '}';
    }
    
    private double calculaRecargo(){
        return this.precio * 0.05;
    }
    private double calculaIVA(){
        return this.precio * 0.21;
    }
    
    private double calculaPrecioFinal(){
        return this.precio+calculaIVA();
    }
    public String muestaProducto(){
        return "Producto{" + "codigo=" + codigo + ", description=" + description + ", precio=" + precio + ", precioFINAL=" + calculaPrecioFinal() + '}';
    }
}
