package Aula07GuanabaraUltraEmojiCombat;

import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	public void marcarLuta(Lutador desafiante, Lutador desafiado ) {
		if(desafiante.getCategoria().equals(desafiante.getCategoria()) && 
				(desafiante != desafiado)) {
			this.aprovada = true;
			this.desafiado = desafiado;
			this.desafiante =desafiante;	
		}
		else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}
	public void lutar() {
		if (aprovada) {
			desafiado.apresentar();
			desafiante.apresentar();
			
			//vencedor = aleatório(0..2);
			Random aleatorio = new Random();
			int vencedor= aleatorio.nextInt(3);
			switch(vencedor) {
				case 0 : //EMPATE
					System.out.println("=====RESULTDADO DA LUTA====");
					System.out.println("Empatou!");
					this.desafiado.empatarLuta();
					this.desafiante.empatarLuta();
					break;
				case 1 : //DESAFIADO VENCE
					System.out.println("=====RESULTDADO DA LUTA====");
					System.out.println("A vitoria foi do " + this.desafiado.getNome());
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
					break;
				case 2 : //DESAFIANTE VENCE	
					System.out.println("=====RESULTDADO DA LUTA====");
					System.out.println("A vitoria foi do "+ this.desafiante.getNome());
					this.desafiante.ganharLuta();
					this.desafiado.perderLuta();
					break;
			}
		}
		else {
			//return "A luta nao pode acontencer.";
			System.out.println("A luta nao pode acontecer! ");
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
