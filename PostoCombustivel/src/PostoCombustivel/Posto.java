package PostoCombustivel;

import java.util.Scanner;

public class Posto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bomba bomba = new Bomba();
		
		bomba.setValorCombustivel(5.0f);
		bomba.setTipoCombustivel("Gasolina");
		bomba.setQuantidadeCombustivel(10);
		
		
		System.out.println("Foi colocado no seu carro: " + bomba.abastecerPorValor(50f) + " L");
		System.out.println("O valor a ser pago : " + bomba.abastecerPorLitro(30) + " Reais");
		System.out.println("O combustivel escolhido foi: " + bomba.getTipoCombustivel());
		System.out.println("A quantidade atual de combustivel na bomba e: " 
				+bomba.getQuantidadeCombustivel()+" L");
		System.out.println();
		bomba.alterarValor(3.5f);
		System.out.println("Voce alterou o valor, agora e: " + bomba.abastecerPorValor(50f));
		bomba.alterarCombustivel("Etanol");
		System.out.println("O tipo de combustivel foi alterado pra: " 
				+ bomba.getTipoCombustivel());
		bomba.alterarQuantidadeCombustivel(20);
		System.out.println("A nova quantidade de combustivel na boma e: " 
				+bomba.getQuantidadeCombustivel()+" L");
		
		
		
		
	}

}
