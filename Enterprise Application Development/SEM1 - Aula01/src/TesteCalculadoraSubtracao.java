import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCalculadoraSubtracao {

	@Test
	public void subtrairQuatroComZero() {
		int n1 = 4;
		int n2 = 0;
		Calculadora calc = new Calculadora();
		int valorEsperado = 4;
		int valorReal = calc.subtrair(n1, n2);
		assertEquals(valorEsperado, valorReal);
	}
	
	@Test
	public void subtrairOitoComQuatro() {
		int n1 = 8;
		int n2 = 4;
		Calculadora calc = new Calculadora();
		int valorEsperado = 4;
		int valorReal = calc.subtrair(n1, n2);
		assertEquals(valorEsperado, valorReal);
	}


}
