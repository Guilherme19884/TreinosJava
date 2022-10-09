package aula05Guanabara;

public class Banco {

	public static void main(String[] args) {
		ContaBanco p1 = new ContaBanco();
		p1.pegarNumConta(1111);
		p1.pegarNomeDono("Jubileu"); //System.out.println(estadoAtual());
		p1.abrirConta("CC");
		
		
		p1.estadoAtual();
	}

}
