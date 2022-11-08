package Imc;

public class Imc {
	
	private float peso;
	private float altura;
	
	
	
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float calcularImc() {
		float Imc = this.peso /(this.altura * this.altura);
		return Imc;
	}
	
	public String toString() {
		return "Seu Imc e: " + calcularImc();
	}
	
}
