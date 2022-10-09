package AulaArray;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*double tempDia001 = 31.7;
		double tempDia002 = 32;
		double tempDia003 = 33.7;
		double tempDia004 = 34;
		double tempDia005 = 33.1;
		double tempDia006 = 32.8;
		double tempDia007 = 30;
		double tempDia008 = 29.8;
		double tempDia009 = 31.5;
		A solução para armazenar uma lista ordenada de dados é criar um array
		
		*/
		/*
		double[] temperaturas = new double [365];
		// boa pratica em Java é declarar um array igual esá acima para poder ser lido com facilidade por outro dev.
		temperaturas[0] = 31.7;
		temperaturas [1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		tmperaturas[4] = 33.1;
		
		System.out.println("O valor da temperaturado dia 1 e: " + temperaturas[0]);
		
		System.out.println("O tamanho do array:  " + temperaturas.length);
		
		System.out.println("Valores do array: "); 
	
		
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("O valor da temperatura do dia " + (i+1) + "e: " + temperaturas[i]);
		}
		*/
		
		
		
		Scanner entrada = new Scanner (System.in);
	
		String[] nomes = new String[3];
		// variaveis
		String pesquisa;
		
		for (int i =0; i < nomes.length; i++) {
			System.out.println("Digite um nome para cadastrar: ");
			nomes[i] = entrada.next();
		}
		
		System.out.println("Dgite um nome para pesquisar: ");
		pesquisa = entrada.next();
		
		
		for(int i = 0 ; i < nomes.length; i++) {
			if(nomes[i].equals(pesquisa)) {
				System.out.println("Encontrado");
			}
			else {
				System.out.println("nops");
			}
		}
		
	entrada.close();
	}	
}
