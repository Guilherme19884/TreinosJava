package ProjetoVacina;

public class Virus {
	private String nomeVirus;
	private float taxaMortalidade;
	private boolean vacina;
	
	
	public String getNomeVirus() {
		return nomeVirus;
	}
	public void setNomeVirus(String nomeVirus) {
		this.nomeVirus = nomeVirus;
	}
	public float getTaxaMortalidade() {
		return taxaMortalidade;
	}
	public void setTaxaMortalidade(float taxaMortalidade) {
		this.taxaMortalidade = taxaMortalidade;
	}
	public boolean isVacina() {
		return vacina;
	}
	public void setVacina(boolean vacina) {
		this.vacina = vacina;
	}
	
	public String toString() {
		int gravidade;
		if (!this.isVacina()&& this.getTaxaMortalidade() ==0.5f) {
			gravidade = 5;
		}
		else if(!this.isVacina()&& this.getTaxaMortalidade() <0.5f ){
			gravidade = 4;
		}
		else if(this.isVacina()&& this.getTaxaMortalidade() >0.5f) {
			gravidade = 3;
		}
		else if(this.isVacina()&& this.getTaxaMortalidade() >=0.2f && 
				this.getTaxaMortalidade() <=0.4) {
			gravidade = 2;
		}
		else {
			gravidade = 1 ;
		}
		
			return "O nome do Virus e: \n "
					+ this.getNomeVirus()
					+"\nA gravidade da situacao e: "
					+"\n Gravidade nivel: "
					+ gravidade ;
	}
	
}
