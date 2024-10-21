package objetos;

public class Cuenta {
    public String titular;
    public double cantidad;
    
    public Cuenta(String titular){
        this.titular = titular;
    }
    public Cuenta(String titular, double cantidad){
        this.cantidad = cantidad;
        this.titular = titular;
    }
    
    public String getTitular(){
        return this.titular;
    }
    public double getCantidad(){
        return this.cantidad;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }
    public void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }
    
    public void muestraDatos(){
        System.out.println("Titular: " + getTitular());
        System.out.println("Cantidad: " + getCantidad());
    }
    
    public void ingresar(double cantidad){
        if(cantidad < 0){}
        else{
            this.cantidad += cantidad;
        }
    }
    public void retirar(double cantidad){
        if(cantidad > this.cantidad){
            this.cantidad = 0;
        }
        else{
            this.cantidad-=cantidad;
        }
    }
    
}
