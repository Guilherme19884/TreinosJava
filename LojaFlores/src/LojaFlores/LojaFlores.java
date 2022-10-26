package LojaFlores;


public class LojaFlores {

	public static void main(String[] args) {

		//Produto prod = new Produto("Rsoa", "vermelha", 20f, 10f, true, 12);

		Produto[] prod = new Produto[10];

		for (int i = 0; i < prod.length; i++) {
			Produto actual = new Produto("Rosa", "vermelha", 20f, 10f, true, 12);
			actual.setNome("Nome " + i);
			actual.setCor("vermelha " + i);
			prod[i] = actual;
		}
		System.out.println(prod[1].getNome());
	}
}
