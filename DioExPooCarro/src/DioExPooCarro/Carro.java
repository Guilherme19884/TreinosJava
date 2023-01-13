package DioExPooCarro;

public class Carro {
	private int portas;
	private String cor;
	private String modelo;
	private float capacidadeTanque;
	
	
	public Carro(int portas, String cor, String modelo, float capacidadeTanque) {
		super();
		this.portas = portas;
		this.cor = cor;
		this.modelo = modelo;
		this.capacidadeTanque = capacidadeTanque;
	}
	
	public int getPortas() {
		return portas;
	}
	public void setPortas(int portas) {
		this.portas = portas;
	}
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getCapacidadeTanque() {
		return capacidadeTanque;
	}
	public void setCapacidadeTanque(float capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	
	public float valorTotaltanque(float valorCombustivel) {
		return capacidadeTanque *= valorCombustivel;
	}

	
}
