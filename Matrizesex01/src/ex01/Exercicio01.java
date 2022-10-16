package ex01;

import java.util.Random;

public class Exercicio01 {

	public static void main(String[] args) {
		int[][] numerosAleatorios = new int[4][4];
		
		Random numeroRandom = new Random();
		
		for(int i = 0 ; i < numerosAleatorios.length; i++) {
			for(int j = 0; j < numerosAleatorios.length; j++) {
				numerosAleatorios[i][j] = numeroRandom.nextInt();
			}
		}
		
		int maior = 0;
		int linha = 0;
		int col = 0;
		for(int i = 0 ; i < numerosAleatorios.length; i++) {
			for(int j = 0; j < numerosAleatorios.length; j++) {
				numerosAleatorios[i][j] = numeroRandom.nextInt();
				if(numerosAleatorios[i][j] > maior) {
					maior = numerosAleatorios[i][j];
					linha = i;
					col = j;
					
		for( i = 0 ; i < numerosAleatorios.length; i++) {
			for( j = 0; j < numerosAleatorios.length; j++) {
				System.out.println( numerosAleatorios[i][j] + "");
			}
		}						
					
					System.out.println("O maior numero: " + maior );
					System.out.println("Linha: " + linha );
					System.out.println("Coluna: " + col );
				}
			}
		}
		
	}

}
 