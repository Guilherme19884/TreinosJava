package TesteSeculo1;

public class Versao1 {

	public static void main(String[] args) {
		int teste = solutionYear(1601);
		System.out.println(teste);

	}
	 static int solutionYear (int year) {
		if(year % 100 == 0 ) {
			year = year /100;
		}
		else {
			year = year /100 + 1;
		}
		return year;
	}
}
// Aqui aprendi a achar a  no Stack OverFlow