package ProjetoCapoeira;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TesteCapoeira {

	@Test
	void testTrocaDeCordel() {
		Capoeirista p = new Capoeirista ();
		
		p.setTempoDeCapoeiraEmAnos(1);
		
		String resultadoEsperado = "Cordel Verde";
		
		Assert.assertEquals(resultadoEsperado, p.getCordel());
	}
	
	@Test
	void testApelido() {
		Capoeirista c = new Capoeirista();
		
		c.setNome("Perna Bamba");
		
		String resultadoEsperado = "Perna Bamba" ;
		
		Assert.assertEquals(resultadoEsperado, c.getNome());
	}
}