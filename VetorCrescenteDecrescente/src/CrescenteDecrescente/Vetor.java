package CrescenteDecrescente;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[] crescente = new int[11];
		int[] decrescente = new int[11];
		
		for (int i = 1; i < crescente.length; i++) {
			System.out.println("Digite o numero que vc vai armazenar na posicao : " + i);
			crescente[i] = sc.nextInt();
		}
		for (int i = 10; i >= 1; i--) {
			System.out.println("Number  : " + i);
			decrescente[i] = sc.nextInt();
		}
		
		sc.close();
	}

}
