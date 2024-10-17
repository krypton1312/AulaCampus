
package objetos;

public class Finanzas {
    private double dolar;
    private double euro;
    private double config;
    public Finanzas(){
        this.config = 1.36;
    }
    public Finanzas(double config){
        this.config = config;
    }
    
    public double getConfig(){
        return this.config;
    }
    public double getDolar(){
        return this.dolar;
    }
    public double getEuro(){
        return this.euro;
    }
    public void mostrarDatos(){
        System.out.println("Euro: " + this.euro);
        System.out.println("Dolar: " + this.dolar);
        System.out.println("Config: " + this.config);
    }
    public void setConfig(double config){
        this.config = config;
    }
    public void setDolar(double dolar){
        this.dolar = dolar;
    }
    public void setEuro(double euro){
        this.euro = euro;
    }
    public double dolaresToEuros(){
        this.euro = this.dolar*this.config;
        return this.euro;
    }
    public double euroToDolar(){
        this.dolar = this.euro / this.config;
        return this.dolar;
    }
    
}
