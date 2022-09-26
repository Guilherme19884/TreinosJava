package empresa;

public class Funcionario {
	private String nome;
	private String funcao;
	private int idade;
	private int id;
	
	public void pegarNome(String nome) {
		this.nome = nome;
	}
	public String mostrarNome() {
		return this.nome;
	}
	
	public void pegarFuncao(String funcao) {
		this.funcao = funcao;
	}
	public String mostrarFuncao() {
		return this.funcao;
	}
	
	public void pegarIdade(int idade) {
		this.idade = idade;
	}
	public int mostrarIdade() {
		return this.idade;
	}
	
	public void pegarId(int id) {
		this.id = id;
	}
	public int mostrarId() {
		return this.id;
	}
}
