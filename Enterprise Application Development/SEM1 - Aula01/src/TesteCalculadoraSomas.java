import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCalculadoraSomas {

	@Test
	public void somarCincoComCinco() {
		int n1 = 5;
		int n2 = 5;
		Calculadora calc = new Calculadora();
		int valorEsperado = 10;
		int valorReal = calc.somar(n1, n2);
		assertEquals(valorEsperado, valorReal);
	}

	@Test
	public void somarDozeComDoze() {
		int n1 = 12;
		int n2 = 12;
		Calculadora calc = new Calculadora();
		int valorEsperado = 24;
		int valorReal = calc.somar(n1, n2);
		assertEquals(valorEsperado, valorReal);
	}

}
