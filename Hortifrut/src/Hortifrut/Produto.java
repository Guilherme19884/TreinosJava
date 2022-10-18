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
			return "Não foi possível efetuar a venda,o produto já passou da validade";
		} else {
			estoque -= quantidadeItens;

			if (estoque == 0) {
				estoqueVazio = true;
			}

			float TotalLucro = valor * quantidadeItens;

			if (diasPassados == vencimento - 1) {
				TotalLucro = TotalLucro - (TotalLucro * 10 / 100);

				return "Houve 10% de desconto,o lucro total foi de: R$" + TotalLucro;
			}

			else {
				return "Venda efetuada com sucesso,o lucro total foi de: R$" + TotalLucro;
			}
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
				+"\n vai vencer da data de fabricacao mais: "
				+ vencimento 
				+ " dias"
				+ "\n quantidade no estoque: "
				+ estoque
				+ "\n O estoque esta vazio: "
				+ getEstoqueVazio();
		
	}	
}