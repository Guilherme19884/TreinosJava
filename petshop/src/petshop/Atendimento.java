package petshop;

public class Atendimento {

	public static void main(String[] args) {
		// Simular o atendimento de um recepcionista através de um totem
		Cliente cliente = new Cliente ();
		
		System.out.println("Bom dia vamos prencher seus dados para vc ser atendido: ");
		
		cliente.pegarNomeDono("Guilherme");
		cliente.pegarNomePet("auau");
		cliente.pegarTipoPet("Cachorro");
		cliente.pegarCorPet("amarelo");
		
		System.out.println("Vamos exibir os dados cliente1: ");
		System.out.println("O Nome do dono: "+ cliente.mostrarNomeDono());
		System.out.println("Nome do bicho de estimacao: " + cliente.mostarNomePet());
		System.out.println("Qual o tipo: " + cliente.mostarTipoPet());
		System.out.println("Qual a cor do bicho de estimacao: " + cliente.mostarCorPet());
	}

}
