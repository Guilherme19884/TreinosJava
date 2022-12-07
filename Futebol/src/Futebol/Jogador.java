package Futebol;

public abstract class Jogador {
	protected String nome;
	protected int idade;
	protected float peso;
	protected float altura;
	protected boolean estaEmCampo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public boolean isEstaEmCampo() {
		return estaEmCampo;
	}
	public void setEstaEmCampo(boolean estaEmCampo) {
		this.estaEmCampo = estaEmCampo;
	}
	
	public void inicializarJogador(float altura, float peso, String nome) {
		this.altura = altura;
		this.nome = nome;
		this.peso = peso;
	}
}
