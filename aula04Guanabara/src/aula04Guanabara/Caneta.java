package aula04Guanabara;

public class Caneta {
	public String modelo;
	private float ponta;
	private boolean tampada;
	private String cor;
	
	public  Caneta (String m, String c, float p) { //Este é o método construtor
		
		this.cor = c;
		this.modelo = m;
		this.pegarPonta(p);
		this.tampar();
	}
	
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
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void status() {
		System.out.println("Sobre a caneta: ");
		System.out.println("Modelo: "+ this.modelo);
		System.out.println("Ponta:"+ mostrarPonta());
		System.out.println("A caneta esta tampada? " + this.tampada);
	}
	
}
