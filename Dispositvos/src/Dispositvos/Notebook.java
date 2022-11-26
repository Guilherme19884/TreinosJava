package Dispositvos;

public class Notebook extends Dispositivo{

	private int voltagemDoCarregador;

	public int getVoltagemDoCarregador() {
		return voltagemDoCarregador;
	}

	public void setVoltagemDoCarregador(int voltagemDoCarregador) {
		this.voltagemDoCarregador = voltagemDoCarregador;
	}

	@Override
	public boolean pesoValido(float peso) {
		if(peso > 5) {
			return false;
		}
		return true;
	}
	
	
}
