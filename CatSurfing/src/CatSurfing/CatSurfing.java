package CatSurfing;

import java.util.Scanner;

public class CatSurfing {

	public static void main(String[] args) {
		Cat gato0 = new Cat( "Pimenta", 1, "macho", "preto e Branco", true, true,
			true, false);
		Cat gato1 = new Cat( "Acucar", 1, "femea", "Branco", true, true,
				true, false);
		Cat gato2 = new Cat( "Melaco", 3, "macho", "preto e cinza", true, true,
				true, true);
		Cat gato3 = new Cat("Copioba", 2, "femea", "amarelo", true, true, 
				false, false );
		
		System.out.println("Digite seu Nome: ");
		Scanner ler = new Scanner(System.in);
		String nomeDono = ler.next(); //faz isso quando mudar o gato e quiser que o nome do dono apareca
					//gato0.setNomeDono(nomeDono); é mudar o numero do gato e chamar o meétodo
		gato0.status();
		gato0.verificarAdocao();
		gato0.castrar();
		gato0.setNomeDono(nomeDono);
		gato0.queroAdotar();
		
		/*o que vc pode testar no sistema:
		 * status () - mostra o cadastro do gato
		 * castrar() - executa a castracao do gato
		 * queroAdotar() - usado para adotar o animal
		 * verificarAdocao() - Se um possivel candidato chega vc pode verificar se o gato,
		 * esta disponivel
		 * 
		 */
		

	}

}
