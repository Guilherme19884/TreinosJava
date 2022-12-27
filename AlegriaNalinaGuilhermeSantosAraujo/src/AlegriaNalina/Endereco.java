package AlegriaNalina;

public class Endereco {
	private int cep;
	private String rua;
	private String cidade;
	private String Bairro;
	
	public Endereco(String rua, String cidade, int cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.cep = cep;
    }
	
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
		this.limitarEntrega();
		if (limitarEntrega () == 0) {
			System.out.println("Não pode entregar");
		}
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return Bairro;
	}
	public void setBairro(String bairro) {
		Bairro = bairro;
	}
	
	public int limitarEntrega() {
		if (this.cep > 10) {
			return 0;
		}
		return 1;
	}
}
