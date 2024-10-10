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
        return precio*1.21;
    }
    public void mostrarDatos()
    {
        System.out.println("Matricula: " + matricula);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio sin IVA: " + precio);
        System.out.println("Precio con IVA: " + calcularIVA());
    }
    public void changePrecio(int a){
        this.precio = a;
    }
    
}
