package objetos;

public class Consumo {
    private double kilometros;
    private double litros;
    private double litrosConsumidos;
    private int vmed;
    private double pgas;
    
    public Consumo(){
        this.pgas = 1.50;
    }
    public Consumo(double kilometros, double litros, double litrosConsumidos, int vmed, double pgas){
        this.kilometros = kilometros;
        this.litros = litros;
        this.litrosConsumidos = litrosConsumidos;
        this.pgas = pgas;
        this.vmed = vmed;
    }
    public void setKilometros(double kilometros){
        this.kilometros = kilometros;
    }
    public void setLitros(double litros){
        this.litros = litros;
    }
    public void setLitrosConsumidos(double litrosConsumidos){
        this.litrosConsumidos = litrosConsumidos;
    }
    public void setPgas(double Pgas){
        this.pgas = pgas;
    }
    public void setVmed(int vmed){
        this.vmed = vmed;
    }
    public double getKilometros(){
        return this.kilometros;    
    }
    public double getLitros(){
        return this.litros;    
    }
    public double getLitrosConsumidos(){
        return this.litrosConsumidos;    
    }
    public double getPgas(){
        return this.pgas;    
    }
    public int getVmed(){
        return this.vmed;    
    }
    public void mostrarDatos(){
        System.out.println("Kilometros: " + kilometros);
        System.out.println("Litros: " + litros);
        System.out.println("Litros consumible: " + litrosConsumidos);
        System.out.println("Velocidad media: " + vmed);
        System.out.println("Precio de la gasolina: " + pgas);
    }
    
    public double getTiempo(){
        return kilometros/vmed;
    }
    public double consumoMedio(){
        return (litros*100)/kilometros;
    }
    public double consumoEuros(){
        return (litros*pgas*100)/kilometros;
    }
}
