import java.util.Scanner;

public class TesteIdade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Cliente cliente = new Cliente();
		Cliente cliente2 = new Cliente();
		
		cliente.receberNome("Guilherme");
		cliente.receberIdade(38);
		cliente.pegarLocalTrabalho("Capgemini");
		cliente.receberSalario(5.500f);
		
		System.out.println("Meu eh: " + cliente.mostrarNome());
		System.out.println("Minha idade eh: " + cliente.mostrarIdade());
		System.out.println("Trabalho na: " + cliente.mostrarLocalTrabalho());
		System.out.print("Meu salario eh:" + cliente.mostrarSalario());
		System.out.println();
		cliente2.receberNome("Rodrigo");
		cliente2.receberIdade(20);
		cliente2.pegarLocalTrabalho("Capgemini");
		System.out.println();
		System.out.println("Meu eh: " + cliente2.mostrarNome());
		System.out.println("Minha idade eh: " + cliente2.mostrarIdade());
		System.out.println("Trabalho na: " + cliente2.mostrarLocalTrabalho());
	}

}
