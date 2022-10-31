package LojaFlores;

import java.util.ArrayList;

public class LojaFlores {

	public static void main(String[] args) {

		// objeto 1
		Produto flor = new Produto("Rosa ", "vermelha ", 20f, 100f, false, 12);
		// obejeto 2
		Produto flor1 = new Produto("Rosa ", "branca ", 20f, 2000f, true, 12);
		// obejeto 3
		Produto flor2 = new Produto("Rosa ", "amarela ", 20f, 1500f, true, 12);

		/*
		 * Outra for de fazer, seria se eu não tivesse feito o construtor faria assim:
		 * 
		 * // objeto 2 Produto flor2 = new Produto(); flor2.setNome("Rosa")
		 * flor2.setCor("azul"); flor2.setPreco(10); flor2.setMesFloresce(11, 5);
		 */

		ArrayList<Produto> flores = new ArrayList<>();
		flores.add(flor);
		flores.add(flor1);
		flores.add(flor2);

		for (int i = 0; i < flores.size(); i++) {
			System.out.println("Preço: " + flores.get(i).getPreco());
		}
		//Ainda precisa completar o código;
	}
}
