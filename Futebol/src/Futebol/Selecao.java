package Futebol;

import java.util.ArrayList;

public class Selecao {
	private String pais;
	private int quantidadeTitulos;
	private ArrayList<Jogador> jogadores;
	
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getQuantidadeTitulos() {
		return quantidadeTitulos;
	}
	public void setQuantidadeTitulos(int quantidadeTitulos) {
		this.quantidadeTitulos = quantidadeTitulos;
	}
	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}
	public void setJogadores(ArrayList<Jogador> jogadores) {
		this.jogadores = jogadores;
	}
	
	public double calcularSalarioTotal() {
		double valorTotal = 0;
		if (this.jogadores != null) {
			for(int i =0; i < this.jogadores.size(); i++) {
				valorTotal += this.jogadores.get(i).getSalario();
			}
		}	
		return valorTotal;
		}
	
}
