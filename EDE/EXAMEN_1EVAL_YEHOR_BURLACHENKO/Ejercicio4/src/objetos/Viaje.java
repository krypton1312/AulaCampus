package objetos;

public class Viaje {

    public Viaje(){
    
    }
    public boolean calculaLibres(int pasajes, int pasajeros){
        return pasajes>pasajeros;
    }
    
    public double calculaRecaudacion(int pasajeros, double precio){
        return pasajeros*precio;
    }
}
