package AlegriaNalina;

public class Brinquedo extends Presente {
	private int idadeRcomendada;
	private int idadeCrianca;
	
	public int getIdadeRcomendada() {
		return idadeRcomendada;
	}

	public void setIdadeRcomendada(int idadeRcomendada) {
		this.idadeRcomendada = idadeRcomendada;
	}

	public int getIdadeCrianca() {
		return idadeCrianca;
	}

	public void setIdadeCrianca(int idadeCrianca) {
		this.idadeCrianca = idadeCrianca;
		this.validarIdade();
	}

	public String validarIdade() {
		
		while(idadeCrianca < idadeRcomendada) {
			return "verifique a idade" ;
		}
		return "entregue o presente";
	}
	
	
	
}
