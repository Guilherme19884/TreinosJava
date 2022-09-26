package petshop;

public class Cliente {
	private String nomeDono;
	private String nomePet;
	private String tipoPet;
	private String corPet;
	
	
	public void pegarNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}
	public void pegarNomePet (String nomePet) {
		this.nomePet = nomePet;
	}
	public void pegarTipoPet (String tipoPet) {
		this.tipoPet = tipoPet;
	}
	public void pegarCorPet (String corPet) {
		this.corPet = corPet;
	}
	
	
	public String mostrarNomeDono() {
		return this.nomeDono;
	}
	public String mostarNomePet () {
		return this.nomePet;
	}
	public String mostarTipoPet () {
		return this.tipoPet;
	}
	public String mostarCorPet () {
		return this.corPet;
	}
}