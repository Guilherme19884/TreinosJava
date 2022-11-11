package PostoCombustivel;

import java.util.Scanner;

public class Posto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bomba bomba = new Bomba();
		
		bomba.setValorCombustivel(5.0f);
		bomba.setTipoCombustivel("Gasolina");
		bomba.setQuantidadeCombustivel(10);
		
		
		System.out.println(bomba.abastecerPorValor(50f));
		System.out.println(bomba.abastecerPorLitro(30));
	}

}
