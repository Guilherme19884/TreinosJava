package LojaFlores;

import java.util.ArrayList;
import java.util.Scanner;

public class Produto {
	private String nome;
	private String cor;
	private float tamanho;
	private float preco;
	private boolean vaso;
	private int estoque;
	
//Construtor 
	public Produto(String nome, String cor, float tamanho, float preco, boolean vaso,
			int estoque) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.tamanho = tamanho;
		this.preco = preco;
		this.vaso = vaso;
		this.estoque = estoque;
	}
//modificadores
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public boolean isVaso() {
		return vaso;
	}

	public void setVaso(boolean vaso) {
		this.vaso = vaso;
	}
	
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
// Métodos publicos
	
	
	public void cadastrar () {
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
	
	public void listar() {
		for (Produto i : lista) {
			System.out.println(i);
		}
		
	}
	public void vender() {
		System.out.println("Qual o modelo que deseja: "+ this.getNome());
		
	}
	
	
	
}
