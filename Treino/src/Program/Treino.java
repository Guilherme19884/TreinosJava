package Program;

import java.util.Locale;
import java.util.Scanner;

public class Age {
	static void checkAge (int age){
		if (age < 18) {
			System.out.println("Access danied");
		}
		else {
			System.out.println("Access garantied");
		}
	}
}

public class Treino {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		checkAge(20);
		
		System.out.println("Enter your age: ");
		
		
		
		sc.close();	
	  }
}
