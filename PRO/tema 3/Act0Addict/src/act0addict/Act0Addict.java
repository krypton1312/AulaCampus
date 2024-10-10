package act0addict;
public class Act0Addict {
    public static void main(String[] args) {
        Vehiculo veh1 = new Vehiculo("4823904", "Tayota", "Prado", 75000);
        veh1.mostrarDatos();
        Vehiculo veh2 = new Vehiculo("АА7777АА", "Audi", "RS 7", 160000);
        veh2.mostrarDatos();
        veh1.changePrecio(15000);
        veh1.mostrarDatos();
    }
}
