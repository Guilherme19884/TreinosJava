package DoisVetores;

import java.util.Scanner;

public class Dois {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] number1 = new int[5];
		int[] number2 = new int[5];
		int[] number3 = new int[5];
		
		
		for(int i = 0; i < number1.length; i++) {
			System.out.println("Digite o numero para ser armazenado vet 1: " + i);
			number1[i] = sc.nextInt();
		}
		for(int i = 0; i < number1.length; i++){
			System.out.println("Digite o numero para ser armazenado vet 2: " + i + " posicao");
			number2[i] = sc.nextInt();
		}
		
		System.out.println("1 - para somar: ");
		System.out.println("2 - para subtrair: ");
		int opcao;
		opcao = sc.nextInt();
		
		if( opcao == 1) {
			for(int i = 0; i < number1.length; i++) {
				number3[i] = number1[i] + number2[i];
				System.out.println(number3[i]);
			}
		}
		
		System.out.println("posicao 3 numero 3" + number3[3]);
		
		sc.close();
	}

}
