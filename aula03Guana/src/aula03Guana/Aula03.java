package aula03Guana;

public class Aula03 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo = "BIC cristal";
		c1.cor = "Azu";
		
		//c1.ponta = 05.f;
		c1.carga = 80;
		//c1.tampada = false;
		c1.destampar();
		c1.status();
		c1.rabiscar();
		
	}

}
