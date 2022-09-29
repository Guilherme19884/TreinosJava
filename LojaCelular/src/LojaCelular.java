import java.util.Scanner;

public class LojaCelular {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Celular celular = new Celular ();
		String marcaQueUsuarioDigitou;
		String modeloQueUsuarioDigitou;
		int serieQueUsuarioDigitou;
		float valorQueUsuarioDigitou;
		boolean seVeioCarregador;
		boolean seVeioFoneDeOuvido;
		
		
		System.out.println("Digite a Marca: ");
		marcaQueUsuarioDigitou = sc.next();
		celular.pegarMarca(marcaQueUsuarioDigitou);
		

		System.out.println("Digite o modelo: ");
		modeloQueUsuarioDigitou = sc.next();
		celular.pegarModelo(modeloQueUsuarioDigitou);
		
		System.out.println("Digite o valor: ");
		valorQueUsuarioDigitou = sc.nextFloat();
		celular.pegarValor(valorQueUsuarioDigitou);
		
		System.out.println("Digite a serie que vem na caixa: ");
		serieQueUsuarioDigitou = sc.nextInt();
		celular.pegarSerie(serieQueUsuarioDigitou);
		
		celular.pegarCarregador(true);
		celular.pegarFoneDeouvido(true);
		
		
		System.out.println("===========Resultado===========");
		System.out.println(celular.mostrarMarca());
		System.out.println(celular.mostrarModelo());
		System.out.println(celular.mostrarSerie());
		System.out.println("Celular veio com carregador? ");
		System.out.println(celular.mostrarCarregador());
		System.out.println("Celular veio com fone de ouvido? ");
		System.out.println(celular.mostrarFoneDeOuvido());
		
		System.out.println(celular);
		
	}

}
