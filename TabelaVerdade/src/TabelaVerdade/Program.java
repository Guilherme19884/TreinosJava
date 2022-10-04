package TabelaVerdade;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int side1,side2,side3;
		
		
		System.out.println("Enter side 1: ");
		side1 = sc.nextInt();
		System.out.println("Enter side 2: ");
		side2 = sc.nextInt();
		System.out.println("Enter side 3: ");
		side3 = sc.nextInt();
		
		if((side1 > side2 + side3) ||(side2 > side3 + side1)){
			System.out.println("Don't triangle. ");
		}
		else if ((side1 == side2) && (side2 == side3)) {
			System.out.println("triangle equilateral. ");
		}
		else if((side1 == side2) || (side2 == side3) || (side1 == side3)) {
			System.out.println("triangle Isoceles. ");
		}
		else {
			System.out.println("Scalene. ");
		}

	}

}
