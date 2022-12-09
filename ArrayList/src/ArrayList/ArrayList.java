package ArrayList;

import java.util.List;

public class ArrayList {

	public static void main(String[] args) {
		List <String> listaPessoas = new java.util.ArrayList<>();
		
		listaPessoas.add("Maria");
		listaPessoas.add("Alex");
		listaPessoas.add("Bob");
		listaPessoas.add("Anna");
		listaPessoas.add("Marco");
		
		//para saber quantos elementos tem na lista.
		System.out.println(listaPessoas.size());
		
		System.out.println("-----------------");
		// para mostrar todos na lista 
		for(String p : listaPessoas) {
			// quando é um List importante colocar o elemento que está dentro do símbolo <>
			System.out.println(p);
		}
		System.out.println("-----------------");
		// para remover pessoas da lista com determinada incial
		
		listaPessoas.removeIf(p -> p.charAt(0) == 'M');
		for (String p : listaPessoas) {
			System.out.println(p);
		}
		System.out.println("-----------------");
		// serve para mostrar o numero que é equivalente  para ao nome
		System.out.println("Index de Bob: " + listaPessoas.indexOf("Bob"));
		// observe que o de Marco não existe porque foi retirado antes e o resultado 
		// dá negativo: -1
		System.out.println("Index de Marco: " + listaPessoas.indexOf("Marco"));
		
		System.out.println("-----------------");
		String nome = listaPessoas.stream().filter(p-> p.charAt(0) == 'A').
				findFirst().orElse(null);
		System.out.println(nome);
		/*
		 * A função acima se tiver um nome na lista com a letra que vc escolhe irá aparecer
		 * caso contrário, retornar null.
		 */
	}

}
