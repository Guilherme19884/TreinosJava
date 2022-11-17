package Spotifi;

public class Spotifi {

	public static void main(String[] args) {
		// instanciar usuario comum
		Usuario usuario = new Usuario();
		usuario.setEmail("ana@gmail.com");
		usuario.setNome("Ana");
		usuario.setSenha("ana01234566");
		usuario.setTemAnuncio(true);
		System.out.println("Senha : "+ usuario.getSenha());
		
		//instanciar usuarioPremium
		UsuarioPremium usuarioPremium =new UsuarioPremium ();
		usuarioPremium.setEmail("beta@gmail.com");
		usuarioPremium.setNome("Roberta");
		usuarioPremium.setValorPago(15.6f);
		usuarioPremium.setSenha("beta1231231354@");
		usuarioPremium.setTemAnuncio(false);
		System.out.println("Senha Premium : " + usuarioPremium.getSenha());
	}

}
