
public class Cliente {
	public String nome;
	public int idade;
	private String localTrabalho;
	private float salario;
	
	public void receberNome(String nome) {
		this.nome = nome;
	}
	public String mostrarNome () {
		return this.nome;
	}
	
	public void receberIdade(int idade) {
		this.idade = idade;
	}
	public int mostrarIdade() {
		return this.idade;
	}
	
	public void pegarLocalTrabalho(String localTrabalho) {
		this.localTrabalho = localTrabalho;
	}
	public String mostrarLocalTrabalho() {
		return this.localTrabalho;
	}
	
	public void receberSalario(float salario) {
		this.salario = salario;
	}
	public float mostrarSalario() {
		return this.salario;
	}
}
