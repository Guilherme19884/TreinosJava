package Spotifi;

public class UsuarioPremium extends Usuario{
	private float valorPago;

		
	public float getValorPago() {
		return valorPago;
	}

	public void setValorPago(float valorPago) {
		this.valorPago = valorPago;
	}
	/*@Override
	public boolean validarSenha(String senha) {
		if(senha.length() >= 10 && senha.contains("!")) {
			return true;
		}
		return false;
	}
	*/
	
	public boolean validarSenha(String senha) {
		if(super.validarSenha(senha) && senha.contains("@")) {
			return true;
		}
		return false;
	}
}
