package LojaBike;

import java.util.ArrayList;

public class Bike {
	private String marca;
	private String modelo;
	private String cor;
	private ArrayList <Acessorios> acessorios;
	
	
	public Bike(String marca, String modelo, String cor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.setAcessorios(new ArrayList <Acessorios>());
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
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}


	public ArrayList <Acessorios> getAcessorios() {
		return acessorios;
	}


	public void setAcessorios(ArrayList <Acessorios> acessorios) {
		this.acessorios = acessorios;
	}


	
	
	
}
