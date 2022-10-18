package Hortifrut;

import java.util.Scanner;

public class Hortifruit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Produto produto = new Produto();

		float valor;
		String nome;
		int dataFabricacao;
		int vencimento;
		int estoque;
		String tipo;
		boolean estoqueVazio;
		
		System.out.println("Digite o nome do produto que vc quer cadatrar: ");
		nome = sc.next();
		produto.setNome(nome);
		
		System.out.println("Digite o valor do produto que vc quer cadastrar: ");
		valor = sc.nextFloat();
		produto.setValor(valor);
		
		System.out.println("Digite a data de fabricacao do produto que vc quer cadastrar: ");
		dataFabricacao = sc.nextInt();
		produto.setDataFabricacao(dataFabricacao);
		
		System.out.println("Digite quantos dias a partir da data de fabriacacao eh a validade: ");
		vencimento = sc.nextInt();
		produto.setVencimento(vencimento);
	
		System.out.println("Digite a quantidade no estoque do produto que vc quer cadastrar: ");
		estoque = sc.nextInt();
		produto.setEstoque(estoque);
		
		System.out.println("Digite o tipo do produto que vc quer cadastrar: ");
		tipo = sc.next();
		produto.setTipo(tipo);
		
		System.out.println();
		System.out.println();
		
		System.out.println("======================PRODUTO CADASTRADO======================");
		
		System.out.println(produto);
		
		
		sc.close();
	}

}
