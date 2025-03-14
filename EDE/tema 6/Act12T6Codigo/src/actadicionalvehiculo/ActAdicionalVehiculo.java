package actadicionalvehiculo;
public class ActAdicionalVehiculo {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("1234ABC", "Toyota", "Corolla", "1600cc", "110HP", 180.0, "Rojo", 15000.0, true, true, true, "Gasolina", false);
        Vehiculo vehiculo2 = new Vehiculo("5678DEF", "Ford", "Fiesta", "1400cc", "90HP", 170.0, "Azul", 12000.0, false, true, false, "Diesel", true);
        Vehiculo vehiculo3 = new Vehiculo("9101GHI", "Honda", "Civic", "1800cc", "130HP", 200.0, "Negro", 18000.0, true, false, true, "Gasolina", false);
        Vehiculo vehiculo4 = new Vehiculo("1213JKL", "Volkswagen", "Golf", "2000cc", "150HP", 210.0, "Gris", 20000.0, true, true, true, "Diesel", true);
        Vehiculo vehiculo5 = new Vehiculo("1415MNO", "Chevrolet", "Spark", "1000cc", "60HP", 150.0, "Blanco", 8000.0, false, false, false, "Gasolina", false);

        
        System.out.println(vehiculo1 + "\n" +vehiculo2 + "\n" +vehiculo3 + "\n" +vehiculo4 + "\n" +vehiculo5 + "\n");
    }

}
