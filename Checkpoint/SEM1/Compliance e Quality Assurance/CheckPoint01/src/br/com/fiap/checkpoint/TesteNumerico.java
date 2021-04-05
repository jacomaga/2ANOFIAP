package br.com.fiap.checkpoint;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.Test;

public class TesteNumerico {

	@Test
	public void testeNumerico() throws IOException {
		
		int resultadoEsperado = 1;
		int resultadoReal = CheckPoint.capturaNro('1');
		
		assertEquals(resultadoEsperado, resultadoReal);
	}

}
