package Aula07GuanabaraUltraEmojiCombat;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	public void marcarLuta(Lutador desafiante, Lutador Desafiado ) {
		if(desafiante.getCategoria() = desafiado.getCategoria() && 
				(desafiante != desafiado)) {
			
		}
	}
	public void Lutar() {
		if (aprovada) {
			desafiado.apresentar();
			desafiante.apresentar();
			vencedor = aleatório(0..2);
		}
	}
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	
	
}
