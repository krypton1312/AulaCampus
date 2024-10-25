package actadicionalvehiculo;

public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private String cilindrada;
    private String potencia;
    private double velocidadMaxima;
    private String calor;
    private double precio;
    private boolean elevalunas;
    private boolean airbag;
    private boolean cierreCen;
    private String motor;
    private boolean averiado;
    private static int numVehiculos;

    public Vehiculo() {
        this.precio = 0;
        this.averiado = false;
        numVehiculos++;
    }

    public Vehiculo(String matricula, String marca, String modelo, String cilindrada, String potencia, double velocidadMaxima, String calor, double precio, boolean elevalunas, boolean airbag, boolean cierreCen, String motor, boolean averiado) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
        this.velocidadMaxima = velocidadMaxima;
        this.calor = calor;
        this.precio = precio;
        this.elevalunas = elevalunas;
        this.airbag = airbag;
        this.cierreCen = cierreCen;
        this.motor = motor;
        this.averiado = averiado;
        
        if(this.averiado){
            numVehiculos++;
        }
        if(motor.equals("Diesel")){
            this.precio+=2000;
        }
        if(cierreCen){
            this.precio+=500;
        }
        if(airbag){
            this.precio+=1000;
        }
        if(elevalunas){
            this.precio+=750;
        }
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

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getCalor() {
        return calor;
    }

    public void setCalor(String calor) {
        this.calor = calor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isElevalunas() {
        return elevalunas;
    }

    public void setElevalunas(boolean elevalunas) {
        this.elevalunas = elevalunas;
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

    public boolean isAveriado() {
        return averiado;
    }

    public void setAveriado(boolean averiado) {
        this.averiado = averiado;
    }

    public static int getNumVehiculos() {
        return numVehiculos;
    }

    public static void setNumVehiculos(int numVehiculos) {
        Vehiculo.numVehiculos = numVehiculos;
    }
    
    private double calculaIVA(){
        return this.precio*1.21;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", cilindrada=" + cilindrada + 
                ", potencia=" + potencia + ", velocidadMaxima=" + velocidadMaxima + 
                ", calor=" + calor + ", precio=" + precio + ", precio con IVA=" + calculaIVA() + ", elevalunas=" + elevalunas + ", airbag=" + airbag + ", cierreCen=" + cierreCen + ", motor=" + motor + ", averiado=" + averiado + '}';
    }
    
    
}
