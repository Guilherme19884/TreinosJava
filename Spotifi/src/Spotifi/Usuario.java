package Spotifi;

public class Usuario {
	protected String nome;
	protected String email;
	protected String senha;
	protected boolean temAnuncio;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		if(this.validarSenha(senha)) {
			this.senha = senha;
		}
	}
	public boolean validarSenha(String senha) {
		if(senha.length() >= 8) {
			return true;
		}
		return false;
	}
	public boolean isTemAnuncio() {
		return temAnuncio;
	}
	public void setTemAnuncio(boolean temAnuncio) {
		this.temAnuncio = temAnuncio;
	}
	
	
	
}
