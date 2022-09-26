package empresa;

public class Loja {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.pegarNome("Nicolas");
		funcionario.pegarFuncao("Cientista");
		funcionario.pegarId(123);
		funcionario.pegarIdade(100);
		
		System.out.println("O nome do funcionario eh: " + funcionario.mostrarNome());
		System.out.println("Seu cargo eh: " + funcionario.mostrarFuncao());
		System.out.println("Seu número eh: " + funcionario.mostrarId());
		System.out.println("Sua idade eh: " + funcionario.mostrarIdade()+ " anos");

	}

}
