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
		System.out.println("Estah ligado? "+ this.isLigado());
		System.out.println("Estah ligado? "+ this.isTocando());
		System.out.println("Estah ligado? "+ this.getVolume());
		
		for(int i= 0; i<= this.getVolume(); i=+10) {
			System.out.println("[]");
		}
		
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando o Menu...");
		
	}

	@Override
	public void maisVolume() {
		if (this.isLigado()) {
			this.setVolume(this.getVolume()+1);
		}
		
	}

	@Override
	public void menosVolume() {
		if (this.isLigado()) {
			this.setVolume(this.getVolume()-1);
		}
		
		
	}

	@Override
	public void ligarMudo() {
		if(this.isLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
		
	}

	@Override
	public void desligarMUdo() {
		if (this.isLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
		
	}

	@Override
	public void play() {
		if(this.isLigado() && !this.isTocando()) {
			this.setTocando(true);
		}
		
	}

	@Override
	public void pause() {
		if (this.isLigado() && this.isTocando()) {
			this.setTocando(false);
		}
		
	}

	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//metodos especiais
	private ControleRemoto() {
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

	
	private boolean isLigado() {
		return ligado;
	}

	privae void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	
	private boolean isTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	
	
	
}