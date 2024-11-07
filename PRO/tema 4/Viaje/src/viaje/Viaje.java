package viaje;
public class Viaje {
    public static void main(String[] args) {
        ViajeClass miViaje = new ViajeClass("1", "Madrid", 350);
        ViajeClass tuViaje = new ViajeClass(miViaje);
        
        System.out.println(tuViaje);
    }

}
