package act3t3;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectanguloTest {

	@Test
	public void testCalculaPerimetro() {
		Rectangulo rect = new Rectangulo();
		int lado1 = 5;
		int lado2 = 3;
		int resEsp = 16;
		assertTrue("Error en metodo", rect.calculaPerimetro(lado1, lado2) == resEsp);
	}

	@Test
	public void testCalculaArea() {
		Rectangulo rect = new Rectangulo();
		int lado1 = 5;
		int lado2 = 3;
		int resEsp = 15;
		assertTrue("Error en metodo", rect.calculaArea(lado1, lado2) == resEsp);
	}

}
