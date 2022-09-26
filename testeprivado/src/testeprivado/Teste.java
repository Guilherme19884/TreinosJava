package testeprivado;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tv tele = new Tv();
		
		
		tele.marca("Lg");
		tele.on(true);
		
		
		System.out.println("A marca eh: " + tele.marca());
		System.out.println("A televisao esta ligada? "  );
		System.out.println(tele.on());
		//tele.desligada(true);
		System.out.println("A televisao esta ligada?" );
		System.out.println(tele.desligada());
		
		sc.close();
	}

}
