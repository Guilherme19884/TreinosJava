package aula02Guanabara;

public class Aula02 {

	public static void main(String[] args) {
		Caneta c1= new Caneta();
		
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.destampar();
		c1.status();
		c1.rabiscar();
		
		Caneta c2 = new Caneta();
		
		c2.cor  = "preta";
		c2.ponta = 0.5f;
		c2.modelo = "Compactor";
		c2.status();
		c2.tampar();
		c2.rabiscar();
		

	}

}
