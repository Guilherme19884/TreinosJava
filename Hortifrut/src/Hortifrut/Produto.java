package Hortifrut;

public class Produto {
	private float valor;
	private String nome;
	private int dataFabricacao;
	private int vencimento;
	private int estoque;
	private String tipo;
	private boolean estoqueVazio;
	
	
	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVencimento() {

		return vencimento;
	}

	public void setVencimento(int vencimento) {
		this.vencimento = vencimento;
	}

	public int getEstoque() {
		return estoque;
		
		
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
		this.estoqueVazio = true;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean getEstoqueVazio() {
		return estoqueVazio;
	}

	public String Venda(int quantidadeItens, int diasPassados) {
		if (dataFabricacao > vencimento) {
			return "Nao foi possivel efetuar a venda,o produto ja passou da validade";
		} 
		else if(estoque == 0) {
			this.estoqueVazio = true;
			return "Estoque vazio = " + this.getEstoqueVazio();
		}
		
		else  {
			estoque -= quantidadeItens;
			return " Estoque atual: "+ this.estoque;
			
		}
	}

	public int getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(int dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	public String toString(){
		return "Produto cadastrado: " 
				+ nome 
				+ "\n item: " 
				+ tipo 
				+ "\n O valor $"
				+ valor 
				+"\n vai vencer dia: "
				+ vencimento 
				+ " dias"
				+ "\n quantidade no estoque: "
				+ this.getEstoque()
				+ "\n O estoque esta vazio: "
				+ getEstoqueVazio();
		
	}	
}