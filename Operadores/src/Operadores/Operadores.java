package Operadores;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 10;
		int y = 3;
		int w = x % y;
		
		System.out.println(w);
		
		int number;
		
		System.out.println("Enter a number: ");
		number = sc.nextInt();
		
		if (number % 2 == 0) {
			System.out.println("this number is pair ");
		}
		else {
			System.out.println("this number is odd ");
		}
		
		
		
		sc.close();
	}
}
