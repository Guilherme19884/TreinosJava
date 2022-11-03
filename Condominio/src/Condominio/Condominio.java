package Condominio;

public class Condominio {

	public static void main(String[] args) {
		CustosCondominiais CCond = new CustosCondominiais ();
		
		
		// setando o objeto
		CCond.setContaAgua(300);
		CCond.setContaEnergia(2000);
		CCond.setSalarioLimpeza(1500);
		CCond.setMesPintura(true);
		CCond.setMesServicos(false);
		
		System.out.println(CCond);
	}

}
