package RetroSentimentos.models;

public abstract class Pessoas {
	protected String nome;
	protected int idade;
	protected boolean parentesco;
	protected String deOndeConhece;
	protected int potuacao;
	
	
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
	public boolean isParentesco() {
		return parentesco;
	}
	public void setParentesco(boolean parentesco) {
		this.parentesco = parentesco;
	}
	public String getDeOndeConhece() {
		return deOndeConhece;
	}
	public void setDeOndeConhece(String deOndeConhece) {
		this.deOndeConhece = deOndeConhece;
	}
	public int getPotuacao() {
		return potuacao;
	}
	public void setPotuacao(int potuacao) {
		this.potuacao = potuacao;
	}
	
	public void Pontuacao() {
		
	}
}
