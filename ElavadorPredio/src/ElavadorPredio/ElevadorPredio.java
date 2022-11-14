package ElavadorPredio;

public class ElevadorPredio {

	public static void main(String[] args) {
		Elevador elevador = new Elevador();

		elevador.setCapacidadeMaxima(6);
		elevador.setTotalAndares(10);
		elevador.setPessoasDentro(1);
		elevador.setAndarAtual(0);

		System.out.println(elevador.inicializa(6,10));
		

	}

}
