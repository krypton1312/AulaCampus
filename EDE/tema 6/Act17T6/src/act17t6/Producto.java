package act17t6;
public class Producto {
    private String codProducto;
    private String nombreProducto;
    private String description;
    private String categoria;
    private double peso;
    private double precio;
    private int stock;
    private double iva;
    
    public Producto(){
        
    }
    public Producto(String codProducto,String nombreProducto,String description,String categoria,double peso,double precio, int stock){
        this.codProducto = codProducto;
        this.nombreProducto = nombreProducto;
        this.description = description;
        this.categoria = categoria;
        this.peso = peso;
        this.precio = precio;
        this.stock = stock;
    }
    public String getCodProducto() {
        return codProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public String getDescription() {
        return description;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }
    
    public double getIVA(){
        return iva;
    }
    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public void muestraDatos() {
        System.out.println("Código del Producto: " + getCodProducto());
        System.out.println("Nombre del Producto: " + getNombreProducto());
        System.out.println("Descripción: " + getDescription());
        System.out.println("Categoría: " + getCategoria());
        System.out.println("Peso: " + getPeso() + " kg");
        System.out.println("Precio: " + getPrecio() + " €");
        System.out.println("Stock: " + getStock() + " unidades");
    }
    
    public void aumentaStock(int a){
        this.stock+=a;
    }
    public void disminuyeStock(int a){
        this.stock-=a;
    }
    public void ivaProducto(double a){
        this.iva = this.precio*a;
    }
}

