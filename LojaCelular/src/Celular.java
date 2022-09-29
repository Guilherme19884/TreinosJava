
public class Celular {
	public String marca;
	public String modelo;
	public int serie;
	public float valor;
	public boolean carregador;
	public boolean  foneDeOuvido;
	
	public void pegarMarca(String marca) {
		this.marca = marca;
	}
	public String mostrarMarca() {
		return this.marca;
	}
	
	
	public void pegarModelo(String modelo) {
		this.modelo = modelo;
	}
	public String mostrarModelo() {
		return this.modelo;
	}
	
	
	public void pegarSerie(int serie) {
		this.serie = serie;
	}
	public int mostrarSerie() {
		return this.serie;
	}
	
	
	public void pegarValor(float valor) {
		this.valor = valor;
	}
	public float mostrarValor() {
		return this.valor;
	}
	
	
	public void pegarCarregador(boolean carregador) {
		this.carregador = carregador;
	}
	public boolean mostrarCarregador() {
		return this.carregador;
	}
	
	
	public void pegarFoneDeouvido(boolean foneDeOuvido) {
		this.foneDeOuvido = foneDeOuvido;
	}
	public boolean mostrarFoneDeOuvido() {
		return this.foneDeOuvido;
	}
	
	
	/* Esse conceito de organizar como eu quero que imprima na tela , fica tudo organizado 
	   a partir daí é só chamar a função na main com o nome do objeto e irá printar na tela 
	   tudo da forma que vc organizou de forma prévia.*/
	
	public String toString() {
		return marca + ", " 
				+ modelo
				+ " $"
				+ valor;
	}
	
}
	