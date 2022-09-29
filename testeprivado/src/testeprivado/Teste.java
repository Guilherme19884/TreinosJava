package testeprivado;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tv tele = new Tv();
		String marcaQueUsuarioDigitou;
		
		
		tele.on(true);
		
		
		// sanando a dúvida de como pegar a informação do 
		//usuario sem ter que deixar pré definida.
		System.out.println("Digite a marca: ");
		marcaQueUsuarioDigitou = sc.next();
		tele.marca(marcaQueUsuarioDigitou);
		
		
		
		System.out.println("A marca eh: " + tele.marca());
		System.out.println("A televisao esta ligada? "  );
		System.out.println(tele.on());
		//tele.desligada(true);
		System.out.println("A televisao esta ligada?" );
		System.out.println(tele.desligada());
		
		sc.close();
	}

}
