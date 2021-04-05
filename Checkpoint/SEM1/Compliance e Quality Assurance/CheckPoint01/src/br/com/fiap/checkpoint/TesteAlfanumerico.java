package br.com.fiap.checkpoint;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.Test;

public class TesteAlfanumerico {

	@Test
	public void testeAlfaNumerico() throws IOException {
		
		int resultadoEsperado = 2;
		int resultadoReal = CheckPoint.capturaNro('x');
		
		assertEquals(resultadoEsperado, resultadoReal);
	}

}
