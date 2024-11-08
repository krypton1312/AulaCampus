package act4t3;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiploTest {

	@Test
	public void testEsMultiplo() {
		Multiplo m = new Multiplo();
		int num1 = 3;
		int num2 = 6;
		assertTrue("Error del metodo", m.esMultiplo(num1, num2));
	}

	@Test
	public void testNoEsMultiplo() {
		Multiplo m = new Multiplo();
		int num1 = 3;
		int num2 = 7;
		assertTrue("Error del metodo", m.noEsMultiplo(num1, num2));
	}

}
