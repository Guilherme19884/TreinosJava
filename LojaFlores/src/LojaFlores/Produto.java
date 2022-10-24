package LojaFlores;

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
		this.setEstoque(getEstoque()+1);
	}
	public void listar() {
		
	}
	public void vender() {
		System.out.println("Qual o modelo que deseja: "+ this.getNome());
		
	}
	
	
	
}
