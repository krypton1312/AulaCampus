package objetos;

public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private int cilindrado;
    private int potencia;
    private int velocida;
    private String color;
    private double precio;

    public Vehiculo(String matricula, String marca, String modelo, int cilindrado, int potencia, int velocida, String color, double precio) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrado = cilindrado;
        this.potencia = potencia;
        this.velocida = velocida;
        this.color = color;
        this.precio = precio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

    public int getCilindrado() {
        return cilindrado;
    }

    public void setCilindrado(int cilindrado) {
        this.cilindrado = cilindrado;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getVelocida() {
        return velocida;
    }

    public void setVelocida(int velocida) {
        this.velocida = velocida;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", cilindrado=" + cilindrado + ", potencia=" + potencia + ", velocida=" + velocida + ", color=" + color + ", precio=" + precio + '}';
    }
    
    public double calculaIVA(){
        return this.precio*0.21;
    }
    
    public int importeExtra(){
        return 0;
    }
}
