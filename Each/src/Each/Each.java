package Each;

public class Each {

	public static void main(String[] args) {
		String[] vect = new String [] {"Gui", "Lai", "Bia"};
		
		System.out.println(vect[1]); // essa é a primeira forma que apredemos nos cursos
		
		System.out.println("---------------------");
		
		for(int i = 0; i <vect.length; i ++ ) {
			System.out.println(vect[i]);
		}
		
		System.out.println("---------------------");
		
		for (String pessoas : vect) {
			System.out.println(pessoas);
		}
	}

}
