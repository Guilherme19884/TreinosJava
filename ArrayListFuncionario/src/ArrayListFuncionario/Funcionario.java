package ArrayListFuncionario;

public class Funcionario {
	private String nome;
	private int id;
	private float salario;
	
	
	public Funcionario(String nome, int id, float salario) {
		super();
		this.nome = nome;
		this.id = id;
		this.salario = salario;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(int percentual) {
		float valorTotal = this.salario * percentual/100;
		this.salario += valorTotal;
	}
	
}
