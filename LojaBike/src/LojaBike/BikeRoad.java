package LojaBike;

public class BikeRoad {
	private int tamanho;
	private String marca;
	private String modelo;
	private boolean freioDisco;
	private String cor;
	private String larguraPneu;
	
	
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
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
	public boolean isFreioDisco() {
		return freioDisco;
	}
	public void setFreioDisco(boolean freioDisco) {
		this.freioDisco = freioDisco;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

	public String toString(){
		return "Me apaixonei nessa bike quando a vi! " +this.getMarca()+" " 
		+ this.getModelo();
	}
	
	
}
