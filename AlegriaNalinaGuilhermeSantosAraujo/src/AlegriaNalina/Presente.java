package AlegriaNalina;

public abstract class Presente {
	 protected String nome;
	 protected String marca;
	 protected double valor;
	
	 
	 public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	 
	public void valorToral() {
		if (this.valor > 100) {
			System.out.println("Diminua o valor");
		}
	}
	

 }
