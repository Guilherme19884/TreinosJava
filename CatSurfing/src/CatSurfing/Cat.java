package CatSurfing;


public class Cat {
	private String nomeTemp;
	private int idadeAprox;
	private String sexo;
	private String corGato;
	private boolean castrado;
	private boolean vacinado;
	private boolean vermifugado;
	private boolean adotado;
	private String nomeDono;
	private String novoEnd;

// Construtor	
	public Cat(String nomeTemp, int idadeAprox, String sexo, String corGato, boolean castrado, boolean vacinado,
			boolean vermifugado, boolean adotado) {
		
		this.nomeTemp = nomeTemp;
		this.idadeAprox = idadeAprox;
		this.sexo = sexo;
		this.corGato = corGato;
		this.castrado = castrado;
		this.vacinado = vacinado;
		this.vermifugado = vermifugado;
		this.adotado = adotado;
	}
// Modificadores
	public String getNomeTemp() {
		return nomeTemp;
	}

	public void setNomeTemp(String nomeTemp) {
		this.nomeTemp = nomeTemp;
	}

	public String getNomeDono() {
		return nomeDono;
	}

	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}
	
	public int getIdadeAprox() {
		return idadeAprox;
	}

	public void setIdadeAprox(int idadeAprox) {
		this.idadeAprox = idadeAprox;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCorGato() {
		return corGato;
	}

	public void setCorGato(String corGato) {
		this.corGato = corGato;
	}

	public boolean isCastrado() {
		return castrado;
	}

	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}

	public boolean isVacinado() {
		return vacinado;
	}

	public void setVacinado(boolean vacinado) {
		this.vacinado = vacinado;
	}

	public boolean isVermifugado() {
		return vermifugado;
	}

	public void setVermifugado(boolean vermifugado) {
		this.vermifugado = vermifugado;
	}

	public boolean isAdotado() {
		return adotado;
	}

	public void setAdotado(boolean adotado) {
		this.adotado = adotado;
	}

//Métodos publicos 
	
	public void status () {
		System.out.println("=========================Gatos Cadastrados Descricao=========================");
		System.out.println("Nome: "+ this.getNomeTemp()+"\n"+ "Sexo: " + this.getSexo()
		+"\n"+ 
		"Idade: "+ this.getIdadeAprox()+ " meses\n" + "Adotado: "+ this.isAdotado()+"\n"
		+"Vermifugado: "+ this.isVermifugado()+ "\n"
		+"Castrado : "+ this.isCastrado()+ "\n"
		+"Vacinado: "+ this.isVacinado());
		System.out.println();
	}	
	
	public void castrar() {
		this.setNomeTemp(getNomeTemp());
		this.setCastrado(true);
		System.out.println("O gato "+  this.getNomeTemp() + " foi castrado? "
		+ "\n R = "+  this.isCastrado()); 
		}
	
	public void verificarAdocao() {
		System.out.println("===========================Verificacao=============================");
		this.setNomeTemp(getNomeTemp());
		if(this.isAdotado()) {
			System.out.println("Gato adotado, ja esta com um lar.");
		}
		else {
			System.out.println("O gato encontra-se disponivel para adocao");
		}
	}
	
	public void queroAdotar() {
		System.out.println("=========================Processo de Adocao===========================");
		this.setNomeTemp(getNomeTemp());
		if(this.isAdotado()) {
			System.out.println("Tente outro, este esta indisponivel.");
		}
		else {
			
			this.setNomeDono(getNomeDono());
			this.setAdotado(true);
			this.setVacinado(true);
			this.setVermifugado(true);
			System.out.println("Parabens pela adocao.");
			System.out.println(this.getNomeDono());
			System.out.println("Seu gato encontra-se:\n" + "vacinado: "+ this.isVacinado()
			+"\n"
			+ "Vermifugado: "+ this.isVermifugado()+ "\n"
			);
		}
	}
	
}
