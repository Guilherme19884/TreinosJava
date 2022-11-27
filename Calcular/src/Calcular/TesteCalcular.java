package Calcular;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCalcular {

	@Test
	void testSomar() {
		Calculadora c = new Calculadora();
		int resultadoEsperado = 10;
		
		int resultado = c.somar(5, 5);
		
		assertTrue(resultado == resultadoEsperado);
		
		
	}

}
