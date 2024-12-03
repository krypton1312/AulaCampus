package objetos;

public abstract class Hardware {
    private String codigo;
    private String marca;
    private String modelo;
    private String descripcion;
    private double precio;

    public Hardware(String codigo, String marca, String modelo, String descripcion, double precio) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Hardware() {
        this.precio = 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Hardware{" + "codigo=" + codigo + ", marca=" + marca + ", modelo=" + modelo + ", descripcion=" + descripcion + ", precio=" + precio + '}';
    }
    
    
}
