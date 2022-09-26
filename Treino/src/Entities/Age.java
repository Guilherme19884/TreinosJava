package Entities;

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

