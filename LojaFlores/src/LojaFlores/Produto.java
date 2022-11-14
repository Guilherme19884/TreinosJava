package LojaFlores;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Produto {
	private String nome;
	private String cor;
	private float tamanho;
	private float preco;
	private Vaso vaso;
	private int estoque;
	private int mesFloresce;
	private boolean temVaso;
	private float valorTotal;
	private ArrayList <Acessorio> acessorios;
	
	
//Construtor 
	public Produto(String nome, String cor, float tamanho, float preco, boolean temVaso,
			int estoque) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.tamanho = tamanho;
		this.preco = preco;
		this.temVaso = temVaso;
		this.estoque = estoque;
		this.acessorios = new ArrayList<Acessorio>();
		this.calcularValorTotal();
	}
	
	/*public float getValorTotal() {
	*	if (this.vaso != null) {
	*		return this.valorTotal = this.preco + this.getVaso().getValor();
	*	}
	*	this.valorTotal = this.preco;
	*	return this.valorTotal ;
	*}refatorando a função acima : pq se o sistema for muito grande esse código vai pesar
	*/
	public float getValorTotal() {
		return this.valorTotal;
	}
	
	public void calcularValorTotal() {
		if (this.vaso != null) {
			this.valorTotal = this.preco + this.vaso.getValor();
		}else {
			this.valorTotal = this.preco;
		}
		if (this.acessorios.size()> 0) {
			for (int i = 0; i < this.acessorios.size(); i++) {
				this.valorTotal += this.acessorios.get(i).getPreco() ;
			}
		}
	}
	/*public void setValorTotal(float preco, float valorVaso) {
	*	this.valorTotal = preco + valorVaso;
	*} essa foi a prieira forma que fiz e dá muito rodeio, a pró falou que não é interessante
	* usar dessa forma pois possa ser que seja outro time que esteja desenvolvendo a main
	* é melhor deixar mais simples pois será mais fácil da outra equipe entender..
	*/
	
	public void setVaso(Vaso vaso) {
		this.vaso = vaso;
		this.calcularValorTotal();
	}
	public Vaso getVaso() {
		return vaso;
	}

	//modificadores
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
		this.calcularValorTotal();
	}

	public boolean isTemVaso() {
		return temVaso;
	}

	public void setTemVaso(boolean temVaso) {
		this.temVaso = temVaso;
	}
	
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	public int getMesFloresce() {
		return mesFloresce;
	}
	public void setMesFloresce(int mesFloresce, int desconto) {
		this.mesFloresce = mesFloresce;
		
		float valorDescontado;
		if(this.mesFloresce == LocalDate.now().getMonthValue()) {
			valorDescontado = this.preco * desconto/100;
			this.preco= this.preco - valorDescontado;
		}
	}

	public ArrayList<Acessorio> getAcessorios (){
		return acessorios;
	}
	public void setAcessorios(ArrayList<Acessorio>acessorios) {
		this.acessorios = acessorios;
		calcularValorTotal();
	}
	
	public void setAcessorio(Acessorio acessorio) {
		this.acessorios.add(acessorio);
		calcularValorTotal();
	}
}
