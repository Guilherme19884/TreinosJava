import java.util.Scanner;

public class Voto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int voto;
		
		System.out.println("Digite seu voto: ");
		voto = sc.nextInt();
		
		switch (voto) {
			case 13:
				System.out.println("Voltou em Lula");
				break;
			case 22:
				System.out.println("Voltou em Bolsonaro");
				break;
			case 15:
				System.out.println("Voltou em Ciro");
				break;
			default: 
				System.out.println("O numero nao corresponde a nenhum dos candidatos escolha 13, 22 ou 15");
		}
	}

}
