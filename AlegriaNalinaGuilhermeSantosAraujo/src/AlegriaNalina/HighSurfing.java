package AlegriaNalina;

import java.util.Scanner;

public class HighSurfing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		Brinquedo b = new Brinquedo ();
		b.setNome("bola");
		b.setIdadeCrianca(3);
		b.setIdadeRcomendada(3);
		b.validarIdade();
		
		System.out.println(b.validarIdade());
	}

}
