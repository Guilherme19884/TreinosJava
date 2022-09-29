package ComparacaoAltura;

public class Aluno {
	public String nome;
	public float altura;
	public int idade;
	public float crescimento;
	
	public void receberNome (String nome) {
		this.nome = nome;
	}
	public String mostrarNome() {
		return this.nome;
	}
	
	public void receberAltura (float altura) {
		this.altura = altura;
	}
	public float mostrarAltura() {
		return this.altura;
	}
	
	public void receberIdade (int idade) {
		this.idade = idade;
	}
	public int mostrarIdade () {
		return this.idade;
	}
	
	public void receberCrescimento (float crescimento) {
		this.crescimento = crescimento;
	}
	public float mostrarCrescimento() {
		return this.crescimento;
	}
}
