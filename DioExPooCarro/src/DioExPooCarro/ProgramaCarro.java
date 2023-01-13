package DioExPooCarro;

public class ProgramaCarro {

	public static void main(String[] args) {
		Carro carro = new Carro(4,"branco","Argo",50f);
		
				
		System.out.println("O valor total para abastecer o carro eh: " + carro.valorTotaltanque(5));

	}

}
