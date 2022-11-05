package ProjetoVacina;

public class ProjetoVacina {

	public static void main(String[] args) {
		Virus virus = new Virus();
		Virus virus1 = new Virus();
		Virus virus2 = new Virus();
		Virus virus3 = new Virus();

		// criando o objeto0
		virus.setNomeVirus("Sarampo");
		virus.setVacina(true);
		virus.setTaxaMortalidade(0.5f);

		// criando o objeto1
		virus1.setNomeVirus("pagodeiro");
		virus1.setVacina(false);
		virus1.setTaxaMortalidade(0.5f);

		// criando o objeto2
		virus2.setNomeVirus("sofrencia");
		virus2.setVacina(true);
		virus2.setTaxaMortalidade(0.1f);

		// criando o objeto3
		virus3.setNomeVirus("doido de pedra");
		virus3.setVacina(true);
		virus3.setTaxaMortalidade(0.8f);

		System.out.println("====================");
		System.out.println(virus);
		System.out.println("====================");
		System.out.println(virus1);
		System.out.println("====================");
		System.out.println(virus2);
		System.out.println("====================");
		System.out.println(virus3);
		
	}

}
