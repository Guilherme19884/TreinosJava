package ComparacaoAltura;

import java.util.Locale;
import java.util.Scanner;

public class ComparacaoAltura {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
				
		Aluno aluno = new Aluno();
		float CrescimentoAnual ;
		String nomeQueUsuarioDigitou;
		int idadeQueUsuarioDigitou;
		
		System.out.println("Digite o nome do aluno: ");
		nomeQueUsuarioDigitou = sc.nextLine();
		//por essa informação dentro do método de chamada
		
		
		System.out.println("Digite o crescimento anual do aluno: ");
		CrescimentoAnual = sc.nextFloat();
		//por essa informação dentro do método de chamada
		
		
		System.out.println("Digite a idade: ");
		 idadeQueUsuarioDigitou = sc.nextInt();
		
		 
		 System.out.println(nomeQueUsuarioDigitou);
		
		sc.close();
	}

}
