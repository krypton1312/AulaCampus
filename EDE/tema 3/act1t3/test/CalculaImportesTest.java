import org.junit.Test;
import static org.junit.Assert.*;
import act1t3.CalculaImportes;

public class CalculaImportesTest {
    
    public CalculaImportesTest() {
        
    }
    @Test
    public void testCalculaDto(){
        CalculaImportes c = new CalculaImportes();
        int precio = 100;
        int proc = 10;
        int res = 10;
        assertTrue("Error" , c.calculaDto(precio, proc) == res);
    }
    
    @Test
    public void testCalculaIVA(){
        CalculaImportes c = new CalculaImportes();
        int precio = 100;
        int IVA = 21;
        int res = 21;
        assertTrue("Error" , c.calculaIVA(precio, IVA) == res);
    }
    
    @Test
    public void testCalculaPrecioFinal(){
        CalculaImportes c = new CalculaImportes();
        double precio = 100;
        double proc = 10;
        double IVA = 21;
        double res = 111;
        assertTrue("Error", c.calculaPrecioFinal(precio, IVA, proc) == res);
    }
}
