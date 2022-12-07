package Futebol;

public class JogadorTitular extends Jogador {
	private String posicao;
	
	@Override
	public void inicializarJogador(float altura, float peso, String nome) {
		super.inicializarJogador(altura, peso, nome);
		this.estaEmCampo = true;
		
	}
}
