package ArrayListFuncionario;

import java.util.ArrayList;
import java.util.List;


public class ArrayListFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario f =  new Funcionario("Guilherme", 0, 4000f);
		Funcionario f1=  new Funcionario("Beatriz", 1, 15000f);
		Funcionario f2=  new Funcionario("Lais", 2, 4000f);
		
		List <Funcionario> funcionarios = new ArrayList<>();
		funcionarios.add(f);
		funcionarios.add(f1);
		funcionarios.add(f2);
		
	
		
	}

}
