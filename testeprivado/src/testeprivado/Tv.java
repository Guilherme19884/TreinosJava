package testeprivado;

public class Tv {
	private String marca;
	private boolean ligada;
	
	public void marca(String marca) {
		this.marca = marca;
	}
	public String marca() {
		return this.marca;
	}
	
	public void on(boolean ligada) {
		this.ligada = ligada;
		ligada = true;
	}
	public boolean on () {
		return this.ligada;
	}
	
	//public void desligada(boolean ligada) {
	//	this.ligada = ligada;
	// = false;
	//}
	public boolean desligada () {
		this.ligada = ligada;
		ligada = false;
		return this.ligada;
	}
}
