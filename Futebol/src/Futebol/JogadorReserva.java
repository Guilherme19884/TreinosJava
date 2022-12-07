package Futebol;

public class JogadorReserva extends Jogador{
	private String tamanhoDoColete;

	public String getTamanhoDoColete() {
		return tamanhoDoColete;
	}

	public void setTamanhoDoColete(String tamanhoDoColete) {
		this.tamanhoDoColete = tamanhoDoColete;
	}
	
	@Override
	public void inicializarJogador(float altura, float peso, String nome) {
		super.inicializarJogador(altura, peso, nome);
		this.estaEmCampo = false;
		
	}
}
