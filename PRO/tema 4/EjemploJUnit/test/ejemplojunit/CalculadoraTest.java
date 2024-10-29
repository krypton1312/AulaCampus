package ejemplojunit;

import org.junit.Test;
import static org.junit.Assert.*;


public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    @Test
    public void testSuma() {
        Calculadora miCalculadora = new Calculadora();
        assertTrue("Error metodo fallo.", miCalculadora.suma(10, 5) == 15);
    }
    
}
