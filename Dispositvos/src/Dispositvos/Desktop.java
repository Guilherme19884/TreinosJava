package Dispositvos;

public class Desktop extends Dispositivo {
	@Override
	public boolean pesoValido(float peso) {
		if (peso > 8) {
			return false;
		}
		return true;
	}

	
	public int carregar(int minutos) {
		int porcentagem = 0;
		if (minutos < 10) {
			porcentagem = 5;
		} 
		else if (minutos < 50) {
			porcentagem = 60;
		} 
		else {
			porcentagem = 100;
		}
		return porcentagem;
	}
}
