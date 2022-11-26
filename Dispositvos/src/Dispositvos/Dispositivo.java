package Dispositvos;

public abstract class Dispositivo {
	protected String marca;
	protected String modelo;
	protected float peso;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		if(this.pesoValido(peso)) {
			this.peso = peso;
		}
	}	
	
	public abstract boolean pesoValido(float peso);
}
