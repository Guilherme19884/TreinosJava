package ArrayClass;

public class ArrayClass {

	public static void main(String[] args) {
		User[] users = new User [10];
		
		for (int i = 0; i < users.length; i++) {
			User actual = new User();
			actual.setFirstName("Nome "+ i);
			actual.setLastName("Sobrenome "+i);
			users[i] = actual;
		}	
	
		System.out.println(users[1].getFirstName());
		System.out.println(users[1].getLastName());
	}
		

}
