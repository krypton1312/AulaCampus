package act1t3;

public class CalculaImportes {
    public double calculaDto(double precio, double proc){
        return precio * (proc / 100);
    }
    
    public double calculaIVA(double precio, double IVA){
        return precio * (IVA / 100);
    }
    
    public double calculaPrecioFinal(double precio, double IVA, double proc){
        return precio + (precio * (IVA / 100)) - (precio * (proc / 100));
    }
}   
