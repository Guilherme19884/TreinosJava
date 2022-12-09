package ArrayListFuncionario;

public class ArrayListFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario f = new Funcionario ();
		f.setNome("Guilherme");
		f.setSalario(4500f);
		System.out.println(f.getNome()+ " "
				+ f.getSalario());
		f.aumentarSalario(10);
		System.out.println("o novo salario é : " + f.getSalario());
	}

}
