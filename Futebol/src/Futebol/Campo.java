package Futebol;

import java.util.ArrayList;

public class Campo {

	public static void main(String[] args) {
		Jogador jogadorTitular = new JogadorTitular() ;
		
		//jogadores titulares
		jogadorTitular.inicializarJogador(1.85f, 85f, "Fulano");
		jogadorTitular.setIdade(20);
		jogadorTitular.setSalario(5800000);
		jogadorTitular.setEstaEmCampo(true);
		
		//jogadores reservas
		Jogador jogadorReserva = new JogadorReserva();
        jogadorReserva.inicializarJogador(1.9f, 90, "Cicraninho");
        jogadorReserva.setIdade(30);
        jogadorReserva.setSalario(650000);
        
		
		
		System.out.println("O jogador: " + jogadorTitular.getNome() + " " 
		+jogadorTitular.getIdade()+ " anos, esta em campo? " + jogadorTitular.isEstaEmCampo());
		
		
		
		ArrayList<Jogador> jogadores = new ArrayList<>();
		
		jogadores.add(jogadorReserva);
		jogadores.add(jogadorTitular);
	}

}
