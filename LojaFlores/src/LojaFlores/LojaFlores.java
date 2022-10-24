package LojaFlores;

import java.util.ArrayList;
import java.util.Scanner;

public class LojaFlores {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		ArrayList<Produto> lista = new ArrayList<Produto>();

		char controle = 's';
		do {
			System.out.println("Digite o nome da Flor: ");
			String nome = leia.next();
			System.out.println("Digite a cor da Flor: ");
			String cor = leia.next();
			System.out.println("Digite o tamanho da Flor: ");
			float tamanho = leia.nextFloat();
			System.out.println("Digite o preco da Flor: ");
			float preco = leia.nextFloat();
			System.out.println("A Flor tem vaso? Digite : true ou false ");
			boolean vaso = leia.nextBoolean();
			System.out.println("Digite a quantidade da flor no estoque: ");
			int quantidade = leia.nextInt();
			
			Produto prod = new Produto(nome, cor, tamanho, preco, vaso, quantidade);
			lista.add(prod);
			System.out.println("Deseja cadastrar outra flor? s ou S para sim. ");
			controle = leia.next().charAt(0);

		}
		while (controle == 's' || controle == 'S');
	}
	
}
