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
		
		//intanciar um vaso
		Vaso vaso = new Vaso();
		vaso.setCor("verde");
		vaso.setMaterial("plastico");
		vaso.setValor(3.5f);
		
		//System.out.println("O vaso da flor: "+ flor.getVaso().getMaterial());
		
		//instanciando novo vaso
		Vaso vaso1 = new Vaso();
		vaso1.setCor("amarelo");
		vaso1.setMaterial("ceramica");
		vaso1.setValor(5.f);
		
		//System.out.println("O vaso da flor 1 : "+ flor1.getVaso().getMaterial());
		
		// adicionar vaso a uma flor 
		flor.setVaso(vaso);
		flor1.setVaso(vaso1);
		
		//mostrar na tela vaso associado
		System.out.println("O vaso da flor: "+ flor.getVaso().getMaterial());
		System.out.println("O Material do vaso 1: "+ flor1.getVaso().getMaterial() );
		System.out.println("O Valor do vaso 1 : "+ flor1.getVaso().getValor());
		System.out.println("A cor do vaso 1: " + flor1.getVaso().getCor());
		
		/*flor1.setValorTotal(flor.getPreco(),vaso.getValor());
		* esse foi a 1 a primeira forma que fiz que tem comentário na em Produto
		* linha 36 e 37
		*/
		System.out.println("Valor total: " +flor1.getValorTotal());
		System.out.println(flor2.getPreco());
		System.out.println("Valor Total da flor: "+ flor2.getValorTotal());
	}
}
