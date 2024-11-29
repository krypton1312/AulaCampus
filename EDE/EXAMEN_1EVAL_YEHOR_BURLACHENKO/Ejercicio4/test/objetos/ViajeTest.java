package objetos;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author YEHORBURLACHENKO
 */
public class ViajeTest {
    
    public ViajeTest() {
    }

    @Test
    public void testCalculaLibres() {
        Viaje miViaje = new Viaje();
        int pasajeros = 100;
        int pasajes = 120;
        assertTrue("Error del metodo", miViaje.calculaLibres(pasajes, pasajeros));
    }

    @Test
    public void testCalculaRecaudacion() {
        Viaje miViaje = new Viaje();
        int pasajeros = 100;
        double precio = 20;
        double resEsp = 2000;
        assertTrue("Error del metodo", miViaje.calculaRecaudacion(pasajeros, precio) == resEsp);
        
    }
    
}
