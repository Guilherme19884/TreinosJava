package Ex02;

import java.util.Random;

public class Exercicio02 {

	public static void main(String[] args) {
		int[][] numerosAleatorios = new int[10][10];

		Random numeroRandom = new Random();

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios.length; j++) {
				numerosAleatorios[i][j] = numeroRandom.nextInt();
			}
		}

		int maior = 0;
		int linha = 0;
		int col = 0;
		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios.length; j++) {
				numerosAleatorios[i][j] = numeroRandom.nextInt();
				if (numerosAleatorios[i][j] > maior) {
					maior = numerosAleatorios[i][j];
					linha = i;
					col = j;

					for (i = 0; i < numerosAleatorios.length; i++) {
						for (j = 0; j < numerosAleatorios.length; j++) {
							System.out.println(numerosAleatorios[i][j] + " ");
						}
					}

					System.out.println("O maior numero: " + maior);
					System.out.println("Linha: " + linha);
					System.out.println("Coluna: " + col);
				}
				System.out.println();
			}
			int maiorL5 = 0;
			int menorL5 = Integer.MAX_VALUE;
			int linha5 = 5;
			for (i = 0; i < numerosAleatorios[linha5].length; i++) {
				if (numerosAleatorios[linha5][i] > maiorL5) {
					maiorL5 = numerosAleatorios[linha5][i];
				}
				if (numerosAleatorios[linha5][i] < menorL5) {
					menorL5 = numerosAleatorios[linha5][i];
				}
			}
			System.out.println("Maior valor da linha 5 = " + maiorL5);
			System.out.println("Menor valor da linha 5 = " + menorL5);

			int maiorC7 = 0;
			int menorC7 = Integer.MAX_VALUE;
			int col7 = 0;

			for (i = 0; i < numerosAleatorios.length; i++) {
				if (numerosAleatorios[i][col7] > maiorC7) {
					maiorC7 = numerosAleatorios[i][col7];
				}
				if (numerosAleatorios[i][col7] < menorC7) {
					menorC7 = numerosAleatorios[i][col7];
				}

			}
			System.out.println("Maior valor da coluna 7 = " + maiorC7);
			System.out.println("Menor valor da coluna 7 = " + menorC7);
			
		}

	}

}
