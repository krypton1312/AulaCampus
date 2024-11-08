import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSuma() {
		Calculadora miCalculadora = new Calculadora();
		int num1 = 5;
		int num2 = 6;
		int resEsp = 11;
		assertTrue("Error en metodo", miCalculadora.suma(num1, num2) == resEsp);
				
	}

	@Test
	public void testResta() {
		Calculadora miCalculadora = new Calculadora();
		int num1 = 5;
		int num2 = 6;
		int resEsp = -1;
		assertTrue("Error en metodo", miCalculadora.resta(num1, num2) == resEsp);
	}

	@Test
	public void testMultiplicacion() {
		Calculadora miCalculadora = new Calculadora();
		int num1 = 5;
		int num2 = 6;
		int resEsp = 30;
		assertTrue("Error en metodo", miCalculadora.multiplicacion(num1, num2) == resEsp);
	}

	@Test
	public void testDivision() {
		Calculadora miCalculadora = new Calculadora();
		int num1 = 12;
		int num2 = 6;
		int resEsp = 2;
		assertTrue("Error en metodo", miCalculadora.division(num1, num2) == resEsp);
	}

}
