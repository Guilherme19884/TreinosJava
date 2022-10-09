package aula04Guanabara;

public class Aula04 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta("NIC", "Amarelo", 0.4f);
		/*c1.pegarModelo("BIC");
		c1.pegarPonta(0.5f);
		c1.status();
		
		Caneta c2 = new Caneta();
		c2.pegarModelo ("Pentel");
		c2.pegarPonta(0.7f);
		c2.status();   */
		
		c1.status();
		Caneta c3 = new Caneta("kkk", "laranja", 0.5f);
		c3.status();
		
		// No netbeans tem um atalho que permite criar set e getter muito rápido e cria outas coisas també
		// no Exlipse também tem essa mesma função pois ele têm intereses
		
	}

}
