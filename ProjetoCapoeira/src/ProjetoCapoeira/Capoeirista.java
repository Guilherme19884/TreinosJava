package ProjetoCapoeira;

public class Capoeirista {
	private String nome;
	private int tempoDeCapoeiraEmAnos;
	private String cordel;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTempoDeCapoeiraEmAnos() {
		return tempoDeCapoeiraEmAnos;
	}

	public void setTempoDeCapoeiraEmAnos(int tempoDeCapoeiraEmAnos) {
		this.tempoDeCapoeiraEmAnos = tempoDeCapoeiraEmAnos;
		this.setCordel();

	}

	public String getCordel() {
		return cordel;
	}

	public void setCordel() {

		if (this.tempoDeCapoeiraEmAnos >= 1 && this.tempoDeCapoeiraEmAnos < 2) {
			this.cordel = "Cordel Verde";
		} else if (this.tempoDeCapoeiraEmAnos >= 2 && this.tempoDeCapoeiraEmAnos < 3) {
			this.cordel = "Cordel Verde e Amarelo";
		} else if (this.tempoDeCapoeiraEmAnos >= 3 && this.tempoDeCapoeiraEmAnos < 4) {
			this.cordel = "Cordel Amarelo";
		} else if (this.tempoDeCapoeiraEmAnos >= 4 && this.tempoDeCapoeiraEmAnos < 5) {
			this.cordel = "Cordel Amarelo e Azul";
		} else if (this.tempoDeCapoeiraEmAnos >= 5) {
			this.cordel = "Cordel Azul";
		} else {
			this.cordel = "Cordel branco";
		}

	}

}
