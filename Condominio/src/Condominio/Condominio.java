package Condominio;

import java.util.Scanner;

public class Condominio {

	public static void main(String[] args) {
		CustosCondominiais CCond = new CustosCondominiais ();
		Scanner sc = new Scanner (System.in);
		
		float valorAgua;
		float valorLuz;
		boolean manutencao;
		boolean pint;
		float sZelador;
		//float valorDesconto;
		
		
		System.out.println("Digite o valor da agua");
		valorAgua = sc.nextFloat();
		CCond.setContaAgua(valorAgua);
		System.out.println("Digite o valor da Luz");
		valorLuz = sc.nextFloat();
		CCond.setContaEnergia(valorLuz);
		System.out.println("Digite: true se esse mes for ter servico manutencao,"
				+ "Se no tiver digite: false");
		manutencao = sc.nextBoolean();
		CCond.setMesServicos(manutencao);
		System.out.println("Digite: true se tiver pintura esse mes, caso contrario"
				+ "digite: false");
		pint = sc.nextBoolean();
		CCond.setMesPintura(pint);
		System.out.println("Digite o valor do salario do zelador");
		sZelador = sc.nextFloat();
		CCond.setSalarioLimpeza(sZelador);
		
		
		CCond.setValorTotalMensalPagar(valorLuz + valorAgua + sZelador );
		System.out.println(CCond);
		
	}

}
