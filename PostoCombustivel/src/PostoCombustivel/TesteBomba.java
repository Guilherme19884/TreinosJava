package PostoCombustivel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteBomba {

	@Test
	void testAlterarCombustivel() {
		Bomba b = new Bomba ();
		
		b.setTipoCombustivel("Gasolina");
		
		String resultadoEsperado = "Gasolina" ;
		
		String resultado = b.getTipoCombustivel();
		
		assertTrue(resultado == resultadoEsperado);
		
	}
	
}
