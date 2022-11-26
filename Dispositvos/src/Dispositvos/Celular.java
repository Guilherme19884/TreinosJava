package Dispositvos;

public class Celular extends Dispositivo implements Movel{
	private boolean temCarregador;
	private boolean temFone;
	
	public boolean isTemCarregador() {
		return temCarregador;
	}
	public void setTemCarregador(boolean temCarregador) {
		this.temCarregador = temCarregador;
	}
	public boolean isTemFone() {
		return temFone;
	}
	public void setTemFone(boolean temFone) {
		this.temFone = temFone;
	}
	
	@Override
	public boolean pesoValido(float peso) {
		if(peso > 1) {
			return false;
		}
		return true;
	}
	@Override
	public int carregar (int minutos) {
		int porcentagem = 0;
		if (minutos <10) {
			porcentagem = 5;
		}
		else if(minutos < 50) {
			porcentagem = 60;
		}
		else {
			porcentagem = 100;
		}
		return porcentagem;
	}
}
