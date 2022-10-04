package aula04Guanabara;

public class Aula04 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.pegarModelo("BIC");
		c1.pegarPonta(0.5f);
		c1.status();
		
		Caneta c2 = new Caneta();
		c2.pegarModelo ("Pentel");
		c2.pegarPonta(0.7f);
		c2.status();

	}

}
