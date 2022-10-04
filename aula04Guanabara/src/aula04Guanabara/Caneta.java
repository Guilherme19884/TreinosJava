package aula04Guanabara;

public class Caneta {
	public String modelo;
	private float ponta;
	
	public String mostrarModelo() {
		return this.modelo;
	}
	public void pegarModelo (String m) {
		this.modelo = m;
	}
	
	public float mostrarPonta() {
		return this.ponta;
	}
	public void pegarPonta(float p) {
		this.ponta = p;
	}
	
	public void status() {
		System.out.println("Sobre a caneta: ");
		System.out.println("Modelo: "+ this.modelo);
		System.out.println("Ponta:"+ this.ponta);
		System.out.println();
	}
	
}
