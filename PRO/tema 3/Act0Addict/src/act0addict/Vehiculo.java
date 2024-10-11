package act0addict;

public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private double precio;
    
    public Vehiculo(String matricula, String marca, String modelo, double precio){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    public double calcularIVA()
    {
        return this.precio*1.21;
    }
    
    public void mostrarDatos()
    {
        System.out.println("Matricula: " + matricula);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio sin IVA: " + precio);
        System.out.println("Precio con IVA: " + calcularIVA());
    }
    public void changeMatricula(String matricula){
        this.matricula = matricula;
    }
    public void changeMarca(String marca){
        this.marca = marca;
    }
    public void changeModelo(String modelo){
        this.modelo = modelo;
    }
    public void changePrecio(double precio){
        this.precio = precio;
    }
   
    public String getMatricula(){
        return this.matricula;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    public double getPrecio(){
        return this.precio;
    }
    
}
