package aula06Guanabara;

public class ControleRemoto implements Controlador {
	@Override
	public void ligar() {
		this.ligado = (true);
		
		
	}

	@Override
	public void desligar() {
		this.ligado = (false);
		
	}

	@Override
	public void abrirMenu() {
		System.out.println("--------MENU--------");
		System.out.println("Estah ligado? "+ this.getLigado());
		System.out.println("Estah tocando? "+ this.getTocando());
		System.out.print("Volume: "+ this.getVolume());
		
		for(int i= 0; i <= this.getVolume(); i+=10) {
			System.out.print("|");
		}
		System.out.println("");
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando o Menu...");
		
	}

	@Override
	public void maisVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume()+5);
		}
		else {
			System.out.println("Impossível aumentar volume com a tv desligada!");
		}
		
	}

	@Override
	public void menosVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume()-5);
		}
		else {
			System.out.println("impossível diminuir volume");
		}
		
		
	}

	@Override
	public void ligarMudo() {
		if(this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
		
	}

	@Override
	public void desligarMudo() {
		if (this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
		
	}

	@Override
	public void play() {
		if(this.getLigado() && !this.getTocando()) {
			this.setTocando(true);
		}
		
	}

	@Override
	public void pause() {
		if (this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		}
		
	}

	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//metodos especiais
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}

	//métods modificadores
	private int getVolume() {
		return volume;
	}
	private void setVolume(int volume) {
		this.volume = volume;
	}

	
	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	
	private boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	
	
	
}
